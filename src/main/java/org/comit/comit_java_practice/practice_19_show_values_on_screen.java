package org.comit.comit_java_practice;

public class practice_19_show_values_on_screen {
	
	@SuppressWarnings("unused") // java annotation

	public static void main(String[] args) {
		// 19 - Write a Java program that does the following:
		// declare a variable N of type int, a variable A of type double
		// and a variable C of type char and assign to each one a value. The following
		// screen displays:
		// The value of each variable. The sum of N + A. And A - N

		int N=20;
		double A=20.99;
		char C='s';
		
		System.out.printf("%d is an integer%n%f is a double%n%c is a char %n",N,A,C);
		
		double sum= N + A;
		double sub=A-N;
		System.out.println("sum="+sum);
		System.out.println("sub="+sub);
	
	}

}
