package com.techelevator;

import java.util.Scanner;

public class example {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.nextLine();

        if(name.equals( "Tom")) {
            System.out.println("You are a jerk!");
        }
    }
}