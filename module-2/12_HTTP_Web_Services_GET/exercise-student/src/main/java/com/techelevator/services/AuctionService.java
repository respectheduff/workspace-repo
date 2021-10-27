package com.techelevator.services;

import org.springframework.web.client.RestTemplate;

import com.techelevator.model.Auction;

public class AuctionService {

    public final String API_URL;
    public final String API_KEY;
    public RestTemplate restTemplate = new RestTemplate();
    private final ConsoleService console = new ConsoleService();

    public AuctionService(String apiUrl, String apiKey) {
        API_URL =  "https://te-pgh-api.azurewebsites.net/api/auctions?apikey=";
        API_KEY = "03006";
    }

    public Auction[] listAllAuctions() {
        // api code here
        return restTemplate.getForObject(API_URL + "auctions?apikey=" + API_KEY, Auction[].class);
    }

    public Auction listDetailsForAuction(int id) {
        // api code here
        return null;
    }

    public Auction[] findAuctionsSearchTitle(String title) {
        // api code here
        return null;
    }

    public Auction[] findAuctionsSearchPrice(double price) {
        // api code here
        return null;
    }

}
