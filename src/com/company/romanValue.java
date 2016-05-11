package com.company;

import java.util.*;
/*
 * Puts integer into correct Roman Numeral form
 */
public class romanValue {
	private static int j = 0, k = 0;
	private static ArrayList<String> romanNum = new ArrayList<String>();
		
	/*
	 * converts roman numeral value in integer form into a roman numeral
	 */
	public static String convert(int number) {
		int m1 = 0, d1 = 0, c1 = 0, l1 = 0, x1 = 0, v1 = 0, i1 = 0;
		int iv, ix, xl, xc, cd, cm;
		int temp = number;
		String sNum = "";
		if (number >= 1000) {
			int M = number / 1000;
			number = number - 1000 * M;
			for (int x = 0; x < M; x++) {
				sNum = sNum + "M";
				// m1++;
			}
		}
		if (number >= 900) {
			number = number - 900;
			sNum = sNum + "CM";
		}
		if (number >= 500) {
			int D = number / 500;
			number = number - 500 * D;
			for (int x = 0; x < D; x++) {
				sNum = sNum + "D";
				d1++;
			}
		}
		if (number >= 400) {
			number = number - 400;
			sNum = sNum + "CD";
		}

		if (number >= 100) {
			int C = number / 100;
			number = number - 100 * C;
			for (int x = 0; x < C; x++) {
				sNum = sNum + "C";
				c1++;
			}
		}
		if (number >= 90) {
			number = number - 90;
			sNum = sNum + "XC";
		}
		if (number >= 50) {
			int L = number / 50;
			number = number - 50 * L;
			for (int x = 0; x < L; x++) {
				sNum = sNum + "L";
				l1++;
			}
		}
		if (number >= 40) {
			number = number - 40;
			sNum = sNum + "XL";
		}
		if (number >= 10) {
			int X = number / 10;
			number = number - 10 * X;
			for (int x = 0; x < X; x++) {
				sNum = sNum + "X";
				x1++;
			}
		}
		if (number >= 9) {
			number = number - 9;
			sNum = sNum + "IX";
		}
		if (number >= 5) {
			int V = number / 5;
			number = number - 5 * V;
			for (int x = 0; x < V; x++) {
				sNum = sNum + "V";
				v1++;
			}
		}
		if (number >= 4) {
			number = number - 4;
			sNum = sNum + "IV";
		}
		if (number >= 1) {
			int I = number / 1;
			number = number - 1 * I;
			for (int x = 0; x < I; x++) {
				sNum = sNum + "I";
				i1++;
			}
		}
		System.out.println(sNum);
		return sNum;
	}
	/*
	 * Same as convert but does not print sNum
	 */
	public static String convert2(int number) {
		int m1 = 0, d1 = 0, c1 = 0, l1 = 0, x1 = 0, v1 = 0, i1 = 0;
		int iv, ix, xl, xc, cd, cm;
		int temp = number;
		String sNum = "";
		if (number >= 1000) {
			int M = number / 1000;
			number = number - 1000 * M;
			for (int x = 0; x < M; x++) {
				sNum = sNum + "M";
				// m1++;
			}
		}
		if (number >= 900) {
			number = number - 900;
			sNum = sNum + "CM";
		}
		if (number >= 500) {
			int D = number / 500;
			number = number - 500 * D;
			for (int x = 0; x < D; x++) {
				sNum = sNum + "D";
				d1++;
			}
		}
		if (number >= 400) {
			number = number - 400;
			sNum = sNum + "CD";
		}

		if (number >= 100) {
			int C = number / 100;
			number = number - 100 * C;
			for (int x = 0; x < C; x++) {
				sNum = sNum + "C";
				c1++;
			}
		}
		if (number >= 90) {
			number = number - 90;
			sNum = sNum + "XC";
		}
		if (number >= 50) {
			int L = number / 50;
			number = number - 50 * L;
			for (int x = 0; x < L; x++) {
				sNum = sNum + "L";
				l1++;
			}
		}
		if (number >= 40) {
			number = number - 40;
			sNum = sNum + "XL";
		}
		if (number >= 10) {
			int X = number / 10;
			number = number - 10 * X;
			for (int x = 0; x < X; x++) {
				sNum = sNum + "X";
				x1++;
			}
		}
		if (number >= 9) {
			number = number - 9;
			sNum = sNum + "IX";
		}
		if (number >= 5) {
			int V = number / 5;
			number = number - 5 * V;
			for (int x = 0; x < V; x++) {
				sNum = sNum + "V";
				v1++;
			}
		}
		if (number >= 4) {
			number = number - 4;
			sNum = sNum + "IV";
		}
		if (number >= 1) {
			int I = number / 1;
			number = number - 1 * I;
			for (int x = 0; x < I; x++) {
				sNum = sNum + "I";
				i1++;
			}
		}
		//System.out.println(sNum);
		return sNum;
	}
}