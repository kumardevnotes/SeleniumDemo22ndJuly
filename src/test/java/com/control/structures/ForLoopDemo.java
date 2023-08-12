package com.control.structures;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		  //initialization; condition;increment/decrement
		for (int i = 1; i <= 5; i++) { // 1; 1 <= 5 --> true
			if(i ==  3) // 3 == 3 --> true
				break;
			//System.out.println("Hello All "+ i);
		}
		
		System.out.println("I am outside 1st for loop");
		
		  //initialization; condition;increment/decrement
				for (int i = 1; i <= 5; i++) { // 1; 1 <= 5 --> true
					if(i ==  3) // 4 == 3 --> false
						continue;
					System.out.println("Hello All "+ i);
				}
				
				System.out.println("I am outside 2nd for loop");
		
	}

}
