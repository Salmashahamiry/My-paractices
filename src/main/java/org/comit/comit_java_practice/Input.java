package org.comit.comit_java_practice;

import java.util.Scanner;

public class Input {
	@SuppressWarnings("unused") // java annotation

	public static void main(String[] args) {
//16 - Write a program in Java that reads an integer from the keyboard and makes the sum of the next 100 numbers, showing the result on screen.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter avalid number: ");
		int number = input.nextInt();
		int sum=0;
		for(int i=number;i<=number+100;i++)
			sum=sum+i;
		System.out.println("sum is : "+ sum);
		System.out.println("*****");
		input.close();
		
	}

}
