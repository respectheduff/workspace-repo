//package com.techelevator;
//
//public class QuizQuestion {
//    private String question;
//    private List<String> answers;
//    private String correctAnswer;
//
//    //this calls to the QuizQuestion String containing the following text, then completing the methods below
//    public QuizQuestion(String line){
//        this.answers = new ArrayList<>();
//        //What color is the sky?|yellow|blue|green|red
//        String[] pieces = line.split("\\|");
//        this.question = pieces[0]; //What color is the sky?
//
//        for (int i = 1; i < pieces.length; i++) {
//            String answer = pieces[i];
//
//            if (answer.endsWith("*")) {
//                answer = answer.substring(0, answer.length() - 1); //blue
//                this.correctAnswer = answer;//correct answer!
//
//            }
//            this.answer.add(answer);
//        }
//    }
//
//    public boolean isCorrectAnswer(String guess) {
//        return correctAnswer.equals(guess);
//    }
//
//    //getters
//
//}
