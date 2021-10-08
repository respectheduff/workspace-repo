//package com.techelevator;
//
//import java.util.Scanner;
//
//public class UserInteraction {
//
//    private Scanner keyboard;
//    public UserInteraction() {
//        keyboard = new Scanner(System.in);
//    }
//    public void askQuizQuestion(QuizQuestion q) {
//        System.out.println(q.getQuestion());
//        List<String> answers = q.getAnswers();
//
//        int counter = 1;
//        for(String answer : answers) {
//            System.out.println("* " + answer);
//            counter
//        }
//    }
//
//    public String promptUserForGuess() {
//        System.out.print("WHat is your guess? >>> ");
//        String guess = keyboard.nextLine();
//        return guess;
//    }
//
//    }
//
