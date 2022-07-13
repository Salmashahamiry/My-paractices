package org.comit.comit_java_practice;

import java.util.Scanner;

public class Positive_or_Negetive {

	public static void main(String[] args) {
		// 20 - Write a java program that declares an
		// integer variable B and assigns it a value. It then displays a message
		// indicating whether the value of B is positive or negative. We will consider 0
		// as positive.
		// If for example B = 1 the output will be 1 is positive. If for example B = -1
		// the output will be: -1 is negative.

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your number: ");
		int B = input.nextInt();
		if(B>=0)
			System.out.printf("%d is possitive",B);
		else
			System.out.printf("%d is negetive",B);
		
		input.close();
	}

}
