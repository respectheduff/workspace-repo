package com.techelevator;

import java.util.Scanner;

class DiscountCalculator {

    /**
     * The main method is the start and end of our program
     */
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        //Prompt user:
        System.out.println("Welcome to the Discount Calculator");

        // Prompt the user for a discount amount
        // The answer needs to be saved as a double
        System.out.print("Enter the discount amount (w/out percentage): ");

        // 20% off!
        String discountString =keyboard.nextLine();
        double discountDoubleCheck = Integer.parseInt(discountString);

        /*
        Integer.parseInt();
        Long.parseLong();
        Float.parseFloat();
        Double.parseDouble();
        Boolean.parseBoolean();
        Character.parseCharacter();
         */




        // Prompt the user for a series of prices
        // 40 125 22 3 500
        System.out.print("Please provide a series of prices (space separated): ");
        String seriesOfPrices = keyboard.nextLine();

        String[] prices = seriesOfPrices.split( " ");
        int price = Integer.parseInt(seriesOfPrices);

        for(int i = 0; i < prices.length; i++){
            String thisPriceAsString = prices[i];
            int thisPriceAsInt = Integer.parseInt(thisPriceAsString);

            System.out.print("This price: " + thisPriceAsInt + " is dounted by:");
            System.out.println(((discountDoubleCheck / 100) * thisPriceAsInt) + " dollars");
        }

        System.out.print("Done!");

    }

}