
package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the fully qualified name of the file that should be searched?");
		String titleOfFile = input.nextLine();

		System.out.println("what is the search word you are looking for?");
		boolean wordQuery = input.nextLine();

		File fileToFind = new File(titleOfFile);



		//getLineNumber()


	}

}
