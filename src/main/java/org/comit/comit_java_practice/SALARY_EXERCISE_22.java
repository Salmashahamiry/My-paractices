package org.comit.comit_java_practice;

import java.util.Scanner;

public class SALARY_EXERCISE_22 {

	public static void main(String[] args) {
		// 22 - Make the program in JAVA such that given as a worker's salary,
		// apply a 15% increase if your salary is less than $ 1000 and 12% otherwise.
		// Print the new salary of the worker. Fact:
		// SUE (variable of a real type that represents the salary of the worker).
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter your salary: ");
		double salary=input.nextDouble();
		double newsalary;
		if(salary<1000)
			newsalary=salary+(salary*15)/100;
		else
			newsalary=salary+(salary*12)/100;
		
		System.out.println("new salary is: "+ newsalary);
		input.close();
	}

}
