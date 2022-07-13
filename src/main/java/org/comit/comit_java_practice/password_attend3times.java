package org.comit.comit_java_practice;

import java.util.Scanner;

public class password_attend3times {

	public static void main(String[] args) {
//		30 - Write a program that asks for a numerical password and allows three attempts.
		// If the user enters the correct password, it shows "Correct!" And run any
		// program, after the message.
		// Otherwise the program should display "Wrong password".
		// Then finish the program immediately.

		Scanner input = new Scanner(System.in);
		int myCorrectPassword = 1234567;
		int password;
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter your password");
			password = input.nextInt();
			if (password == myCorrectPassword) {
				System.out.println("Correct");
				break;}
				else
					System.out.println("Wrong password");
			
			if(i==2)
				break;
			}

input.close();
		}
	}


