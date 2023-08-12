package com.control.structures;

public class IfElseExampleOROperator {

	public static void main(String[] args) {
	
		String stdName  = "John Doe";
		
		int StdMarks_Sem1 = 30;
		int StdMarks_Sem2 = 20;
		int StdMarks_Sem3 = 20;
		
		/*
		 * OR Operator - ||
		 * true || true --> true
		 * true || false --> true
		 * false || true --> true
		 * false || false --> false
		 * */
		
		if(StdMarks_Sem1 >= 35 || StdMarks_Sem2 >= 35 || StdMarks_Sem3 >=40 ) { // false || false --> false
			System.out.println("Std passed in exam");
		}
		
		else {
			System.out.println("Std failed in the exam");
		}
		
		System.out.println("Std results displayed");

	}

}
