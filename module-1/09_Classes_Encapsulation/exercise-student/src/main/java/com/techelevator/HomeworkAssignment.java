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

    //Derived Property: letterGrade (there is no "String letterGrade
    public String getLetterGrade() {
        String grade = null;

        return grade;
    }

    //Getters & Setters
    public int gotEarnedMarks() {
        return earnedMarks;
    }

}

public void setEarnedMarks(int earnedMarks) {
    this.earnedMarks =
}
