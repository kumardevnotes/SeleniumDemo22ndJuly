package com.control.structures;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your calculator operation");
		String myOperation = scanner.next();
		
		System.out.println("Please enter your num1");
		int num1 = scanner.nextInt();
		
		System.out.println("Please enter your num2");
		int num2 = scanner.nextInt();
		
		switch(myOperation) {
		case "ADD":
			System.out.println(num1+num2);
			break;
		case "SUBTRACT":
			System.out.println(num1-num2);
			break;
		case "MULTIPLICATION":
			System.out.println(num1*num2);
			break;
		case "DIVISION":
			System.out.println(num1%num2);
			break;
		default:
			System.out.println("Something went wrong. Please check your operation name");
		}
		
	}

}
