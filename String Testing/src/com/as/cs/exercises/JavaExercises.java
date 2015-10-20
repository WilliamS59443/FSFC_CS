package com.as.cs.exercises;

import java.util.*;

public class JavaExercises {

	public static void main(String[] args) 
	{
		checkMethod();
	}
	static void checkMethod(){
		int age;
	
	Scanner in = new Scanner(System.in);
	System.out.print("What is your age?");
	age = in.nextInt();
	
	if(age>17)
		System.out.println("Let's get married!");
	else if(age<10)
		System.out.println("No way are you getting married any time soon");
	else
		System.out.println("Hmmm, aren't you a little young?");
		
	}
	

}
