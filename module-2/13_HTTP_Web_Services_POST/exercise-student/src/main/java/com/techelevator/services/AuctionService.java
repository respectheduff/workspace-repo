package com.techelevator.services;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import com.techelevator.model.Auction;
import org.w3c.dom.css.CSSValue;

public class AuctionService {

	private final String API_URL;
	private final String API_KEY;
	protected RestTemplate restTemplate = new RestTemplate();
    private final ConsoleService console = new ConsoleService();

    public AuctionService(String apiUrl, String apiKey) {
        API_URL = apiUrl;
        API_KEY = apiKey;
    }

    public Auction[] listAllAuctions() {
        Auction[] auctions = null;
        try {
            auctions = restTemplate.getForObject(API_URL + "?apikey=" + API_KEY, Auction[].class);
        } catch (RestClientResponseException ex) {
            console.printError("Could not retrieve the auctions. Is the server running?");
        } catch (ResourceAccessException ex) {
            console.printError("A network error occurred.");
        }
        return auctions;
    }

    public Auction listDetailsForAuction(int id) {
        Auction auction = null;
        try {
            auction = restTemplate.getForObject(API_URL + "/" + id + "?apikey=" + API_KEY, Auction.class);
        } catch (RestClientResponseException ex) {
            console.printError("Could not retrieve the auction.");
        } catch (ResourceAccessException ex) {
            console.printError("A network error occurred.");
        }
        return auction;
    }

    public Auction[] findAuctionsSearchTitle(String title) {
        Auction[] auctions = null;
        try {
            auctions = restTemplate.getForObject(API_URL + "?apikey=" + API_KEY + "&title_like=" + title, Auction[].class);
        } catch (RestClientResponseException ex) {
            console.printError("The title was not found. Please try again.");
        } catch (ResourceAccessException ex) {
            console.printError("A network error occurred.");
        }
        return auctions;
    }

    public Auction[] findAuctionsSearchPrice(double price) {
        Auction[] auctions = null;
        try {
            auctions = restTemplate.getForObject(API_URL + "?apikey=" + API_KEY + "&currentBid_lte=" + price, Auction[].class);
        } catch (RestClientResponseException ex) {
            console.printError("No auctions found. Please try again.");
        } catch (ResourceAccessException ex) {
            console.printError("A network error occurred.");
        }
        return auctions;
    }

    public Auction add(String auctionString) {
        // place code here
        Auction Auction = makeAuction( auctionString );
        if (Auction == null){
        return null;
        }
        HttpEntity entity = makeEntity(Auction);
        try {
            Auction = restTemplate.postForObject(API_URL + "?apikey=" + API_KEY, entity, Auction.class);
        } catch (RestClientResponseException ex) {
            console.printError(ex.getRawStatusCode() + " : " + ex.getStatusText());
        }
        return Auction;
    }

    public Auction update(String auctionString) {
        // place code here
        Auction Auction = makeAuction( auctionString);
        if (Auction == null) {
            return null;
        }
        try {
            restTemplate.put(API_URL + "/" + Auction.getId() + "?apikey=" + API_KEY, Auction);
        } catch (RestClientResponseException ex) {
            console.printError(ex.getRawStatusCode() + " : " + ex.getStatusText());
            Auction = null;
        }
        return Auction;
    }

    public boolean delete(int id) throws RestClientResponseException, ResourceAccessException {
        // place code here
        try {
            restTemplate.delete(API_URL + "/" + id + "?apikey=" + API_KEY);
        } catch (RestClientResponseException ex) {
            console.printError(ex.getRawStatusCode() + " : " + ex.getStatusText());
        }
        return false;
    }

    private HttpEntity<Auction> makeEntity(Auction auction) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Auction> entity = new HttpEntity<>(auction, headers);
        return entity;
    }

    private Auction makeAuction(String CSV) {
        String[] parsed = CSV.split(",");
        // invalid input
        if (parsed.length < 4 || parsed.length > 5) {
            return null;
        }
        // Add method does not include an id and only has 5 strings
        if (parsed.length == 4) {
            // Create a string version of the id and place into an array to be concatenated
            String[] withId = new String[6];
            Auction[] auctions = listAllAuctions();
            if (auctions == null) {
            	return null; // Some exception or other problem occurred.
            }
            String[] idArray = new String[]{auctions.length + 1 + ""};
            // place the id into the first position of the data array
            System.arraycopy(idArray, 0, withId, 0, 1);
            System.arraycopy(parsed, 0, withId, 1, 4);
            parsed = withId;
        }
        return new Auction(Integer.parseInt(parsed[0].trim()), parsed[1].trim(), parsed[2].trim(), parsed[3].trim(), Double.parseDouble(parsed[4].trim()));
    }


}