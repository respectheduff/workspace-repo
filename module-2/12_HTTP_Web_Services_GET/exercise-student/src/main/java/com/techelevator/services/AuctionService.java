package com.techelevator.services;

import org.springframework.web.client.RestTemplate;

import com.techelevator.model.Auction;

import java.util.Scanner;

public class AuctionService {

    public final String API_URL_BASE;
    public final String API_KEY;
    public String API_SEARCH_KEY;
    public RestTemplate restTemplate = new RestTemplate();
    private final ConsoleService console = new ConsoleService();

    public AuctionService(String apiUrl, String apiKey) {
        API_URL_BASE = "https://te-pgh-api.azurewebsites.net/api/auctions";
        API_KEY = "03006";

    }
    // /auctions/{ }?apikey=
    public Auction[] listAllAuctions() {
        // api code here
        String url = API_URL_BASE + "/" + "?apikey=" + API_KEY;
        return restTemplate.getForObject(url, Auction[].class);
    }

    public Auction listDetailsForAuction(int id) {
        // api code here
        String url = API_URL_BASE + "/" + id + "?apikey=" + API_KEY;
        return restTemplate.getForObject(url, Auction.class);
    }

    public Auction[] findAuctionsSearchTitle(String title) {
        // api code here
        String url = API_URL_BASE +"?apikey=" + API_KEY+ "&title_like=" + title ;
        return restTemplate.getForObject(url, Auction[].class);
    }

    public Auction[] findAuctionsSearchPrice(double price) {
        // api code here
        String url = API_URL_BASE + "?apikey=" + API_KEY + "&currentBid_lte=" + price;
        return restTemplate.getForObject(url, Auction[].class);
    }

}
