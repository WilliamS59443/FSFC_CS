package com.as.cs.exercises;

import java.util.*;

public class StudentGrade {

	public static void main(String[] args) {
		int quiz;
		int midTerm;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your quiz score: ");
		quiz = in.nextInt();
		
		System.out.print("Enter your mid-term score: ");
		midTerm = in.nextInt();
		
		float resultScore;
		float finalScore;
		float score;
		resultScore = quiz + midTerm;
		finalScore = (float)resultScore / 200;
	    score = (float)finalScore * 100;
	    System.out.println("You got " + score + "%");
	    
	    if(score <= 100 && score >= 90){
	    	System.out.println("You got an A grade");
	    }else if(score >= 70 && score < 90){
	        System.out.println("You got a B grade");
	    }else if(score >= 50 && score < 70){
	    	System.out.println("You got a C grade");
	    }else if(score < 50){
	    	System.out.println("You got an F grade");
	    }else{
	    	System.out.println("You must have entered your scores wrong, they should be between 0 and 100");
	        
	    }
		
		
		
		
		
		
		
		
		
		
		

	}

}
