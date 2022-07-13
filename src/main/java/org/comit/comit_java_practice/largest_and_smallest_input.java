package org.comit.comit_java_practice;

import java.util.Scanner;

public class largest_and_smallest_input {
	@SuppressWarnings("unused") // java annotation

	public static void main(String[] args) {
		//18 - Write a program in Java that reads two numbers
		//on the keyboard and says which is the largest and which is the smallest.

		Scanner input=new Scanner(System.in);
		int a;
		int b;
		System.out.println("Enter the first number: ");
		a=input.nextInt();
		System.out.println("Enter the second number: ");
		b=input.nextInt();
		
		if(a>b)
			System.out.printf("%d is greates and %d is smallest number",a,b);
		else if(a<b)
			System.out.printf("%d is greates and %d is smallest number",b,a);
		else
			System.out.printf("they are equal");
		input.close();


	}

}
