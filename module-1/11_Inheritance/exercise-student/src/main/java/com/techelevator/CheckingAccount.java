package com.techelevator;


//class
public class CheckingAccount extends BankAccount{
    // we wont lose the class when we override it . you must call back to the super class withdraw

    //new constructor
    public CheckingAccount(String accountHolderName, String accountNumber ) {
       super(accountHolderName,accountNumber);

    }
    // second new constructor
    public CheckingAccount(String accountHolderName,String accountNumber, int balance){
        super(accountHolderName, accountNumber, balance);
    }
    // this is the override method. you may need to call to the parent method then add it to the function to work properly
    @Override
    //name of override method
        public int withdraw ( int amountToWithdraw){
            if (getBalance() < 0.00) {
                // parent method  being processed through the override method
                super.withdraw(  amountToWithdraw+ 10);
                return getBalance();
            }else{
                return super.withdraw(amountToWithdraw);
            }

        }
}