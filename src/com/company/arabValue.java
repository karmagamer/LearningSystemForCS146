package com.company;

import java.util.*;

public class arabValue {
	private static ArrayList<String> stringDigits = new ArrayList<String>();
	private static int x = 0, total = 0;
	private static Stack stack = new Stack();
	private static Stack value = new Stack();

	/*
	 * gets final value of the roman numeral;
	 */
	public static int getFinal(String number) {
		stringDigits = getDigits(number, x, stringDigits); // puts roman numeral
															// in array
		stack = getStack(stringDigits); // puts the roman numerals in stack form
		value = getValue(stringDigits);// puts the roman numeral digits value in
										// stack form
		total = getTotal(value, number);// evaluates the romal numeral's value
		stringDigits.clear(); // clears the arrayList
		stack.clear(); // clears the stack
		value.clear();// clears the stack
		return total;

	}

	/*
	 * Evaluates the Roman Numeral's value
	 */
	public static int getTotal(Stack value, String number) {
		int length = number.length() - 1;
		int temp1 = (Integer) value.peek();
		int total = temp1;
		int prev = 0;
		int temp = (Integer) value.peek();
		for (int j = 0; j < length; j++) { // loops for how many digits the
											// numeral has

			if (j == 0) {
				value.pop();
			}
			int nextValue = (Integer) value.peek();
			if ((temp > nextValue) && (prev != nextValue)) { // if right value
																// is greater
																// than left
																// value and
																// right and
																// left numeral
																// cannot be
																// equal
				total = total - nextValue;
				temp = total;
				prev = nextValue;
			} else {
				total = nextValue + total;
				temp = total;
				prev = nextValue;
			}
			value.pop();
		}
		return total;

	}

	/*
	 * / gets value of Roman Numerals digits in stack form
	 */
	public static Stack getValue(ArrayList<String> stringDigits) {
		for (int j = 0; j < stringDigits.size(); j++) { // iterates for how many
														// digits are in the
														// roman numeral
			stack.push(stringDigits.get(j));
			value.push(convert(stack));
		}

		return value;
	}

	/*
	 * / puts each character of roman numeral in a stack
	 */
	public static Stack getStack(ArrayList<String> stringDigits) {
		for (int j = 0; j < stringDigits.size(); j++) { // for
			stack.push(stringDigits.get(j));
		}
		for (int j = 0; j < stringDigits.size(); j++) {
			stack.pop();
		}
		return stack;

	}

	/*
	 * puts digits of roman numeral into an arrayList
	 */
	public static ArrayList<String> getDigits(String number, int x, ArrayList<String> stringDigits) {
		int length = number.length();
		while (x < length) {
			stringDigits.add(number.substring(x, x + 1));
			x++;
		}
		return stringDigits;

	}

	/*
	 * converts the value of the roman numeral digit into an integer
	 */
	public static int convert(Stack stack) {
		int total = 0;

		if (stack.peek().equals("I") || stack.peek().equals("i")) {
			total = 1;
		} else if (stack.peek().equals("V") || stack.peek().equals("v")) {
			total = 5;
		} else if (stack.peek().equals("X") || stack.peek().equals("x")) {
			total = 10;
		} else if (stack.peek().equals("L") || stack.peek().equals("l")) {
			total = 50;
		} else if (stack.peek().equals("C") || stack.peek().equals("c")) {
			total = 100;
		} else if (stack.peek().equals("D") || stack.peek().equals("d")) {
			total = 500;
		} else if (stack.peek().equals("M") || stack.peek().equals("m")) {
			total = 1000;
		}
		return total;
	}

}