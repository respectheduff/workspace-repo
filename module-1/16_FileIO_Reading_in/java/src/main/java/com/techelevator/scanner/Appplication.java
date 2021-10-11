package com.techelevator.scanner;
import java.io.File;
import java.util.Scanner;

public class Appplication {
    public static void main(String[] args) {
        RTNValidator rtn = new RTNValidator();

        File rtnFile = new File("rtn.txt");
        try {
            Scanner fileInput = new Scanner(rtnFile);

            while(fileInput.hasnextline()) {
                String currentLine = fileInput.nextLine();
                boolean isValid = rtn.checksumIsValid(currentLine);


        } catch (Exception e) {
            System.out.println("Couldnt open " + rtnFile.getName());
        }
        String input = "123456789";
        boolean testCase = rtn.checksumIsValid(input);

        System.out.println(currentLine + " is ");
        if(isValid) {
            System.out.println();

        }else { System.out.println("NOT VALID!");



    }
}
