package com.company;
import java.util.*;
/*
 * Main Method
 */
public class RomanStack {
	
			private static arabValue a = new arabValue();
			private static romanValue r = new romanValue();
			private static boolean run = true;
			public static void main(String[]args){
				while(run==true){ // Runs the menu in a loop
				
				menu();
				
				}
			}
			/*
			 * Gives user menu to choose from
			 */
		
			public static void menu(){
				System.out.println("Enter One Of The Following Numbers: ");
				System.out.println("1. Roman");
				System.out.println("2. Arabic");
				System.out.println("3. Exit");
				int answer = 0;
				Scanner s = new Scanner(System.in);
				try{ // if invalid input is given, restart menu method
				answer = s.nextInt();
				if(answer==1){  // if 1 start manipulating roman numerals
					romanConvert();
				}else if(answer==2){ // if 2 start manipulating arabic numerals
					arabConvert();
				}else if(answer==3){ // if 3 exit the program
					System.out.println("Program Exiting...");
					System.exit(0);
				}
				}catch(Exception e){
					menu();
				}
					}
				
			/*
			 * Manipulates Roman Numerals
			 */
			public static void romanConvert(){
				check c = new check();
				String line = "";
				String number = "";
				String number2 = "";
				boolean run = false;
				while(run==false){
				try{                                     // Gets values, if values invalid restart method
				System.out.println("Input 2 Roman Numerals: ");
				Scanner l = new Scanner(System.in);
				line = l.nextLine();
				line = c.checkSpace(line);
				Scanner s = new Scanner(line);
				number = s.nextLine();
				s.nextLine();
				number2 = s.nextLine();
				if(c.checkFinal(number)==false||c.checkFinal(number2)==false){
					romanConvert();
				}
				//number2 = c.checkFinal(number2);
				int value1 = a.getFinal(number);
				int value2 = a.getFinal(number2);
				c.checkAction(line,value1,value2);
				menu();
				}catch(Exception b){
					System.out.println("ERROR! Please Input A Valid Equation");
					romanConvert();
				}
				}
			}
			/*
			 * Manipulates Arabic Numbers
			 */
			public static void arabConvert(){
				check c = new check();
				String line = "";
				String number = "";
				String number2 = "";
				try{ // gets values, if value invalid restarts method
				System.out.println("Input 2 Arabic Numerals: ");
				Scanner l = new Scanner(System.in);
				line = l.nextLine();
				line = c.checkSpace(line);
				Scanner s = new Scanner(line);
				number = s.nextLine();
				s.nextLine();
				number2 = s.nextLine();
				int value1 = Integer.parseInt(number);
				int value2 = Integer.parseInt(number2);
				c.checkAction2( line, value1, value2);
				menu();
				}catch(Exception d){
					System.out.println("ERROR! Please Input A Valid Equation!");
					arabConvert();
				}
			}



}