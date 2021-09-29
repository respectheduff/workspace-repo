package com.techelevator;

public class BuyoutAuction extends Auction {
    private int buyoutrpice;

    public BuyoutAuction(String item, int buyoutPrice) {
        super(item);
        this.buyoutrpice = buyoutPrice;
    }

    @Override
    public boolean placeBid(Bid theBid) {
        if(theBid.getBidAmount() < buyoutPice) {
            super.placeBid(theBid);
        }
        else{

            // adjust the bid to meet the buyout price exactly
            Bid buyoutbid = new Bid(theBid.getBidder(), buyoutPrice);
            super.placeBid(buyoutbid);
        }
    }

    public int getBuyoutrpice() {
        return buyoutrpice;
    }
}
}