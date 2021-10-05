package com.techelevator;

public class HomeworkAssignment {
    //Data: instance variables
    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;

    //Constructor
    public HomeworkAssignment(int possibleMarks, String submittername) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submittername;
    }
    public int getPossibleMarks() {

        return possibleMarks;
    }

    public int getEarnedMarks()
    {
        return earnedMarks;
    }

    public void setEarnedMarks(int earnedMarks) {

        this.earnedMarks = earnedMarks;
    }

    public String getSubmitterName() {

        return submitterName;
    }

    public String getLetterGrade() {
        double percentage = (double) earnedMarks / possibleMarks;
        if (percentage >= 0.9) {
            return "A";
        } else if (percentage >= 0.8) {
            return "B";
        } else if (percentage >= 0.7) {
            return "C";
        } else if (percentage >= 0.6) {
            return "D";
        } else {
            return "F";
        }
    }

}
