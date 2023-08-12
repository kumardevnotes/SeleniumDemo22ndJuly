package com.control.structures;

public class IfElseExample {

	public static void main(String[] args) {
	
		String stdName  = "John Legened";
		int stdMarks = 34;
		
		if(stdMarks >= 35) { // 34 >= 35 --> false
			System.out.println("Std passed in the exam");
			System.out.println("Std passed in Maths");
		}
		
		else if(stdMarks <= -1) { // 34 <= -1 --> true
			System.out.println("std got invalid marks. Please check");
		}
		
		else {
			System.out.println("Std failed in the exam");
		}
		
		System.out.println("Std results displayed");

	}

}
