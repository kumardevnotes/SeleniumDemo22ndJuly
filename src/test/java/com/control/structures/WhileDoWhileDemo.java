package com.control.structures;

public class WhileDoWhileDemo {

	public static void main(String[] args) {
		
		int num = 0;
		
		//In While, the condition is checked first
		// if the condition is true, then only while block is executed
		while(num > 0) { // 0 > 0
			System.out.println(num);
			num--; //3
		}
		
		
		//In DoWhile, the Do block is executed first. And then the condtion is checked
		// if the condition is true, then only it will run the DoWhile Block for the second time
		int num2 = 0;
		
		do {
			System.out.println(num2);
			num2--; // 1-1 == 0
		} while (num2 > 0); // 0 > 0

	}

}
