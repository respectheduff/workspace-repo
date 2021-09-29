package com.techelevator;

public class chef extends Person { // extends from the person class so it will inherit from the parent class
    private int yearsExperience;
    private String specialty;

    public chef(String firstName, String lastName, int age, int yearsExperience, String specialty) {
        super(firstName, lastName, age); // this is the call to the parent aka super. and it must be called first before the usage in the child

        this.yearsExperience = yearsExperience;//this. refers to THIS current instance so you are call the value of yearsExperience
        this.specialty = specialty;
    }

    public String getFirstName() {
        String firstName = super.getFirstName();
        return "chef" + firstName;
    }
}