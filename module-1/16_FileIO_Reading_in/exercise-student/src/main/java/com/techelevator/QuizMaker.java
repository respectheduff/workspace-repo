//package com.techelevator;
//
//public class QuizMaker {
//
//	public static void main(String[] args) {
//
//		UserInteraction ui = new UserInteraction();
//
//		File quizFile = new File("test_quiz.txt");
//		try{
//			Scanner quizFileScanner = new Scanner(quizFile);
//			List<QuizQuestion> questionList = new ArrayList<>();
//
//			while(quizFileStreamer.hjasnextLine()) {
//				String line = quizFileStreamer.nextLine();
//				QuizQuestion q = new QuizQuestion(line);
//				questionlist.add(q);
//			}
//
//			int correctAnswers = 0;
//			for(QuizQuestion q : questionList) {
//				ui.askQuizQuestion(q);
//				String guess = ui.promptUserForGuess();
//				if (q.isCorrectAnswer(guess)) {
//					System.out.println("You are correct!");
//					correctAnswers++;
//				} else {
//					System.out.println("You are wrong! ");
//				}
//			}
//			System.out.println();
//			System.out.println("you got" + correctAnswers "out of" + questionList.size() + "correct");
//			System.out.println(((double)correctAnswers * 10) / questionList.size() + "%");
//
//
//
//		}catch (FileNotFoundException e) {
//
//			QuizQuestion q = new QuizQuestion();
//		}
//	}
//
//}
