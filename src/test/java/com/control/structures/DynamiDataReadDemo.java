package com.control.structures;

import java.util.Scanner;

public class DynamiDataReadDemo {

	public static void main(String[] args) {
		//Dynamic data Reading in Java using keyboard
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num1 = obj.nextInt();
		System.out.println("The number entered is "+ num1);
		
		System.out.println("Please enter the stdName");
		String stdName = obj.next();
		System.out.println("The StdName entered is "+ stdName);
		
		
		
	}

}
