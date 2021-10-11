package com.techelevator;

public class BankAccount {
//come first
    private String accountHolderName;
    private String accountNumber;
    private int balance;
//  a constructor ,comes second
    public BankAccount(String accountHolderName, String accountNumber) {
        // perameters of contructors. no return type and the same name as my class.
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }
// second contructor
    public BankAccount(String accountHolderName, String accountNumber, int balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }
// the methods: come third
        public int deposit(int amountToDeposit){
            //shorthand for balance = amount + balance
           // balance += amountToDeposit;
            return balance += amountToDeposit;
        }

        public int withdraw(int amountToWithdraw){
            // balance -= amountToWithdraw;
            return balance -= amountToWithdraw;
        }

    // getters. duh. come last
    public String getAccountHolderName(){
        return accountHolderName;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public int getBalance(){
        return balance;
    }


}







