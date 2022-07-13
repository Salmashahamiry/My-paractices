package org.comit.comit_java_practice;

import java.util.Scanner;

public class Make_a_Calculator {
	@SuppressWarnings("unused") // java annotation

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //24 - Make a calculator.

		Scanner input = new Scanner(System.in);

		double num1, num2, result = 0;

		System.out.println("Enter your first number: ");
		num1 = input.nextDouble();
		
		System.out.println("Enter your second number: ");
		num2 = input.nextDouble();
		
		System.out.println("Enter your operation: ");
		String Operator = input.next();
		

		switch (Operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "%":
			result = num1 % num2;
		default:
			System.out.println("invalid operator , try again");
			break;

		}
		System.out.println("result is : ");
		System.out.println(result);
		input.close();
	}

}
