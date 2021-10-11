
package com.techelevator;

import java.io.File;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the fully qualified name of the file that should be searched?");
		String titleOfFile = input.nextLine();

		System.out.println("what is the search word you are looking for?");
		String wordQuery = input.nextLine();

		File fileToFind = new File(titleOfFile);
		try(Scanner fileScanner = new Scanner(fileToFind)){
			int lineNumber = 1;
			while(fileScanner.hasNextLine()){
				String line = fileScanner.nextLine();
				if (line.contains(wordQuery)){
					System.out.println(lineNumber +". "+ line);
				}
				lineNumber++;
			}

		}catch(Exception e){
			System.out.println("didnt work");
		}





	}

}
