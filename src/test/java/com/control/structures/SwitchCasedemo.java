package com.control.structures;

public class SwitchCasedemo {

	public static void main(String[] args) {
		
		// Assignment, int month = 14, sysout("February")
	
		String day = "Friday";
		
		switch(day) {
		case "Monday":
			System.out.println(day + " Its a weekday!");
			break;
		case "Tuesday":
			System.out.println(day + " Its a weekday!");
			break;
		case "Wednesday":
			System.out.println(day + " Its a weekday!");
			break;
		case "Thursday":
			System.out.println(day + " Its a weekday!");
			break;
		case "Friday":
			System.out.println(day + " Its a weekday!");
			System.out.println(day + " Its a weekday!");
			System.out.println(day + " Its a weekday!");
			//
			//
			break;
		case "Saturday":
			System.out.println(day +" Its a weekend!");
			break;
		case "Sunday":
			System.out.println(day + " Its a weekend!");
			break;
		default:
			System.out.println("Please pass a valid day");
		}
		
		System.out.println("I am outside switch block");
		
	}

}
