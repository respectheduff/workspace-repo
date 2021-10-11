package com.techelevator;

import java.util.List;

public class BankCustomer implements Accountable{

    private String name;
    private String address;
    private String phoneNumber;
    public List<Accountable> accounts;
    private int BankCustomer;


    public int getBalance() {
        return 0;
    }

    public void addAccount(Accountable newAccount){

    }

    public boolean isVip(){

        if(BankCustomer >= 25000){
            return true;
        }


        return false;
    }

}
