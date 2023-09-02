package com.java.file.io;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class JavaDemoReadDynamicdata {

	public static void main(String[] args) {
		
		Scanner scan  =  new Scanner(System.in);
		
		String empName, empGender;
		int empID;
		
		System.out.println("Please enter employee name");
		empName = scan.nextLine();
		
		System.out.println("Please enter employee gender");
		empGender = scan.nextLine();
		
		System.out.println("Please enter employee Id");
		empID = scan.nextInt();
		
		System.out.println("Printing employee details entered above");
		
		System.out.println(empName);
		System.out.println(empGender);
		System.out.println("EmpId: " + empID);
		
		
		List empIds = new ArrayList();
		Iterator itr = null;  
		
		empIds.add(1122);
		empIds.add(1123);
		empIds.add(1124);
		empIds.add(1125);
		
		itr = empIds.iterator();
		
	     while(itr.hasNext()){  
             System.out.println(itr.next());  
         }   
		
	}

}
