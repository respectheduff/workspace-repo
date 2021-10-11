package com.techelevator;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;


public class FizzWriter {


	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter the path of a file or directory >>> ");
		String path = userInput.nextLine();
		File f = new File(path);
		try{
			PrintWriter toFile = new PrintWriter(f);
			for(int i = 1; i <= 300; i++ ){
				toFile.println(i);
			}
			toFile.flush();
		}catch(Exception e){
			System.out.println("nooooooooo");
		}
	}

}
