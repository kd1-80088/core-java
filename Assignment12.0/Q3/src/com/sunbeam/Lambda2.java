package com.sunbeam;

import java.util.Scanner;

public class Lambda2 {

	public static int menu() {
		System.out.println("0. Exit");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		int choice = new Scanner(System.in).nextInt();
		return choice;
	}

	public static void calculate(double d1, double d2, Arithmetic op) {
		double result = op.calc(d1, d2);
		System.out.println(result);
	}

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first Number");
		int num1 = sc.nextInt();
		System.out.println("Enter second Number");
		int num2 = sc.nextInt();

		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1: {
				calculate(num1, num2, (d1, d2) -> d1 + d2);// inside that their is method calc working on d1,d2
			}
				break;
			case 2: {
				calculate(num1, num2, (d1, d2) -> d1 - d2);
			}
				break;
			case 3: {
				calculate(num1, num2, (d1, d2) -> d1 * d2);
			}
				break;
			case 4: {
				calculate(num1, num2, (d1, d2) -> d1 / d2);
			}
				break;
			default: {
				System.out.println("Wrong Input");
			}
			}
		}
		System.out.println("Thank you!!!");
	}

}
