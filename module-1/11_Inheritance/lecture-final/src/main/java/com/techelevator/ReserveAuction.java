package com.techelevator;

public class ReserveAuction extends Auction {
    private int reservePrice;

    public ReserveAuction(String itemForSale, int reservePrice) {
        super(itemForSale);
        this.reservePrice = reservePrice;
    }

    @Override
    public boolean placeBid(Bid theBid) {
        if(theBid.getBidAmount() >= reservePrice) {
            return super.placeBid(theBid);
        }

        return false;
    }

    public int getReservePrice() {
        return reservePrice;
    }
}
