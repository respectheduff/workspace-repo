package com.techelevator;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");

        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids

        BuyoutAuction buyoutAuction = new BuyoutAuction( "Tech Elevator Backpack", 35);
        generalAuction.placeBid(new Bid("Josh", 20));
        generalAuction.placeBid(new Bid("Fonz", 25));
        generalAuction.placeBid(new Bid("Rick Astley", 50));

        ReserveAuction reserveAuction = new ReserveAuction("Tech elevator Laptop", 1250);
        reserveAuction.placebid(new Bid("Josh", 400));
        reserveAuction.placebid(new Bid("fonz", 2000));
    }
}
