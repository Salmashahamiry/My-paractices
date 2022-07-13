package org.comit.comit_java_practice;

public class Multiplication_table {

	@SuppressWarnings("unused") // java annotation

	public static void main(String[] args) {
		
		//23 - Make a program that prints the 10 multiplication tables.


		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++)
				System.out.printf(i * j + " ");
			System.out.println();
		}

	}

}
