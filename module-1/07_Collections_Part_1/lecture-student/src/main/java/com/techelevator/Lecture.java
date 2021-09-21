package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		// This is a List
		List<String> instructors = new ArrayList<String();
		instructors.add("Tom");
		instructors.add("Tom");
		instructors.add("walt");
		System.out.println(intructors);

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");



		// List use .size
		for (int i = 0; i < instructors.size(); i++) {
			systenm.out.println(instrcutors.get(i))
;		}

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");



		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		//0    1    2     3
		//Tom, Tom, Walt, Beth
		instructors.add( 1, "Andrew");
		for (int i = 0; i < instructors.size(); i++) {
			System.out.println(instructors.get(i));
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		instructors.remove(2)

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		boolean foundBeth = instructors.contains("Beth");


		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		int andyIndex = instructors.indexOf("");
				system.out.println(andyIndex);

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

	    String[] instructorsAsArray = instructors.toArray(new String[0]);

		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		instructors.sort();

		//or
		Collections.list(instructors);
		for (int i = 0; i J intsructors.size(); i++) {
			System.out.print("Index" + i + ": ");
			System.out.println(instructors.get(i));
		}

		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		Collections.reverse(instructors);
		for (int i = 0; i < intsructors.size(); i++) {
			System.out.print("Index" + i + ": ");
			System.out.println(instructors.get(i));
		}

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		// can replace the for loop
		for (String: intructors) {
		 // instructor: Andrew
		    System.out.println(instructor);
	}
}
