package com.qa.main;

import java.util.Scanner;

public class DivisionException {
	
	public void divisionEx()throws ArithmeticException {
		
		Scanner input = new Scanner(System.in);
		
		//boolean flag = true;
		
		//while(flag == true) {
			int result = 0;
			System.out.println("Please insert first value");
			
			try {
			result = input.nextInt();
			}catch(Exception e){
				
				System.out.println(e);
				
			}
			
			int x = result;
			
			System.out.println("Please insert second value");
			
			try {
			result = input.nextInt();
			}catch(Exception e){
				
				e.printStackTrace();
				
			}
			
			int y = result;
			
			if (x < y) {
				
				throw new DivByZeroExc();
				
			}
			
			int z = 0;
			try {
			z = x / y;
			}catch(Exception e){
				
				System.out.println("You cannot divide by zero!" + e.getMessage());
				
			}
			
			System.out.println("Your answer for " + x + "/" + y + "=" + z);
			
		//}
		
		
		
		
		input.close();
		System.out.println("Input has been closed.\n\t- Exit!");
	}
	

}
