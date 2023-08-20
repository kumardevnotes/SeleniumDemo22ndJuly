package com.exceptions;

import java.util.Scanner;

public class JavaExceptionDemo {

	public static void main(String[] args) throws InterruptedException {
		try {
			// Scanner scanner = new Scanner(System.in);
			// System.out.println("please enter numbers");

			int num1 = 100, num2 = 10;
			System.out.println(num1 / num2);

			Thread.sleep(2000); // 2000ms = 2 seconds

			String empName = "John";
			System.out.println(empName.toUpperCase());

		} catch (ArithmeticException e) {
			System.out.println("Exception caught " + e);
		} catch (NullPointerException e) {
			System.out.println("Exception caught " + e);
		}

		finally {
			//cleanup connection to database
			System.out.println("I am from finally block and I always run whether you get exception or not");
		}

		System.out.println("Program execution is complete");
	}

}
