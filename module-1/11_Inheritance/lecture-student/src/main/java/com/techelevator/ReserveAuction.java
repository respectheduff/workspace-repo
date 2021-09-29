package com.techelevator;

import java.util.List;

public class ReserveAuction extends Auction{
    private integer reversePrice;

    public ReserveAuction(String itemForSale, int reservePrice) {
        super(itemForSale);
        this.reservePrice = reservePrice;
    }


    public boolean placebid(Bid theBid) {
        if(theBid.getBidAmount() >= reservePrice) {
            return super.placeBid(theBid);
        }
        return false
    }
    public int getReservePrice() {
        return reversePrice;
    }
}
