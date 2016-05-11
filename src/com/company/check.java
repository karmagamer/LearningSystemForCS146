package com.company;

import java.util.*;

/*
 * Checks if Roman Numeral is in correct form
 */
public class check {
	private static ArrayList<String> stringDigits = new ArrayList<String>();

	// Checks if roman numeral is in correct form
	public boolean checkFinal(String number) {
		boolean check = true;
		RomanStack r = new RomanStack();
		int e = checkReal(number);
		int total = e;
		if (total > 0) {// if roman numeral is in inccorect form, send false
						// boolean to main method
			System.out.println("ERROR! INVALID INPUT!");
			check = false;
		}
		return check;
	}

	public static String checkSpace(String line) {
		if (line.contains("+")) {
			line = line.replace("+", "\n + \n");
		} else if (line.contains("*")) {
			line = line.replace("*", "\n * \n");
		} else if (line.contains("-")) {
			line = line.replace("-", "\n - \n");
		} else if (line.contains("/")) {
			line = line.replace("/", "\n / \n");
		}
		return line;
	}

	/*
	 * Checks operators in the input given for Roman Numerals
	 */
	public void checkAction(String line, int value1, int value2) {
		romanValue r = new romanValue();
		int sum = 0, product = 0, quotient = 0, difference = 0;
		if (line.contains("*")) { // if star multiply
			product = value1 * value2;
			System.out.println("Product is " + product);
			r.convert(product);
		} else if (line.contains("/")) { // if forward slash divide
			quotient = value1 / value2;
			System.out.println("Quotient is " + quotient);
			r.convert(quotient);
		} else if (line.contains("+")) { // if plus add
			sum = value1 + value2;
			System.out.println("Sum is " + sum);
			r.convert(sum);
		} else if (line.contains("-")) { // if minus subtract
			difference = value1 - value2;
			System.out.println("Difference is " + difference);
			r.convert(difference);
		}
	}

	// For Arabic;
	/*
	 * Checks operators in the input given for Arabic Numerals and performs
	 * action
	 */
	public void checkAction2(String line, int value1, int value2) {
		romanValue r = new romanValue();
		int sum = 0, product = 0, quotient = 0, difference = 0;
		if (line.contains("*")) { // if star mulitply
			product = value1 * value2;
			// System.out.println("Product is "+ product);
			System.out.print(product);
		} else if (line.contains("/")) { // if forward slash divide
			quotient = value1 / value2;
			System.out.println(quotient);
			// System.out.println("Quotient is "+ quotient);
		}
		if (line.contains("+")) { // if plus sign add
			sum = value1 + value2;
			System.out.println(sum);
			// System.out.println("Sum is "+ sum);
		}
		if (line.contains("-")) { // if minus subtract
			difference = value1 - value2;
			System.out.print(difference);
			// System.out.println("Difference is "+ difference);
		}
	}

	/*
	 * Checks if the form of the Roman Numeral given is correct
	 */
	public static int checkReal(String number) {
		arabValue a = new arabValue();
		romanValue r = new romanValue();
		int check = 0;
		int value1 = a.getFinal(number);
		if (!(number.equals(r.convert2(value1)))) { // if roman numeral given is
													// not equal to the real
													// roman numeral form, ERROR
			// System.out.println(value1);
			check = 1;
		}
		return check;
	}
}
//