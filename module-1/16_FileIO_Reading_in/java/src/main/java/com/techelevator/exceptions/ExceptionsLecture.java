package com.techelevator.exceptions;

import java.util.Scanner;

public class ExceptionsLecture {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of degrees Fagrentheight >>>");
		String userTyped = scan.nextLine();
		try {
			int userTypedAsInteger = Integer.parseInt(userTyped);
			int answerInCelcius = userTypedInteger;
			System.out.println( userTypedAsInteger + " dregrees F is equal to: " + answerInCelcuis + " in F");

		} catch (Exception e) {
			System.out.println("Hey, play nice");
		}
	}
}
