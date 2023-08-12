package com.java.demo;

public class JavaStringDemo2 {

	public static void main(String[] args) {
		
		String empCity = "NewYork"; 
		
		System.out.println(empCity.isEmpty()); //false
		
		// empCity[0] = N
		// empCity[1] = e
		// empCity[2] = w
		// empCity[3] = Y
		// empCity[4] = o
		// empCity[5] = r
		// empCity[6] = k
		//length() ---> 7
		
		System.out.println(empCity);
		
		//in-built String methods in java
		
		System.out.println(empCity.toUpperCase()); //NEWYORK
		System.out.println(empCity.toLowerCase()); //newyork
		System.out.println(empCity.charAt(6)); //k
		System.out.println(empCity.startsWith("New")); //true
		System.out.println(empCity.endsWith("Yor")); //false
		
		empCity = "  NewYork  ";
		System.out.println(empCity); //  NewYork  
		
		System.out.println(empCity.trim()); //NewYork
		
		System.out.println(empCity.length()); //7
		System.out.println(empCity.equals("newyork")); //false
		System.out.println(empCity.equalsIgnoreCase("newyork")); //true
		
		System.out.println(empCity.concat("New")); //true
		
		System.out.println(empCity.replace('N', 'X'));
		
		
		
	}

}
