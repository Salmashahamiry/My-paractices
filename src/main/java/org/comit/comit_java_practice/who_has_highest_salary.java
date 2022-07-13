package org.comit.comit_java_practice;

import java.util.Scanner;
@SuppressWarnings("unused") // java annotation

public class who_has_highest_salary {

	public static void main(String[] args) {
		// 26 - Make a program that asks for the salary of N workers
		// (first you must ask how many workers there are) and print the one with the
		// highest salary.
		Scanner input = new Scanner(System.in);
		System.out.println("how many workers do you have: ");
		int N=input.nextInt();
		float[] employeeSalary=new float[N];
		float maxSalary=0;
		for(int i=0;i<N;i++) {
			employeeSalary[i]=input.nextFloat();
			if (employeeSalary[i]>maxSalary)
				maxSalary=employeeSalary[i];
		}
		input.close();
		System.out.println(maxSalary);
	}

}
