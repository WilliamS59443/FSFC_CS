package com.as.cs.exercises;

public class StringExercises {

	public static void main(String[] args) {
		
		String firstName = "Will";
		String lastName = " Stephenson";
		String fullName = firstName + lastName;
		System.out.println(fullName);
		System.out.println(firstName.equals(lastName));
		
		String anotherName = null;
		anotherName = firstName;
		System.out.println(firstName.equals(anotherName));
		
		String myfirstName = new String ("Will");
		String myanotherName = new String ("Will");
		
		System.out.println(myfirstName.equals(myanotherName));
		System.out.println(firstName == myfirstName);
		
		
		
		
	
		
	}

}
