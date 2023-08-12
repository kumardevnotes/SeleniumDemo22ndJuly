package com.control.structures;

public class IfElseExampleANDOperator {

	public static void main(String[] args) {
	
		String stdName  = "John Legened";
		
		int stdMarks = 60;
		
		/*
		 * AND Operator - &&
		 * true && true --> true
		 * true && false --> false
		 * false && true --> false
		 * false && false --> false
		 * */
		
		if(stdMarks >= 35 && stdMarks == 100) { // true && false --> false
			System.out.println("Std passed in distinction");
		}
		
		else if(stdMarks >= 60 && stdMarks <= 75) { // true && true --> true
			System.out.println("Std passed in first class");
		}
		
		else {
			System.out.println("Std failed in the exam");
		}
		
		System.out.println("Std results displayed");

	}

}
