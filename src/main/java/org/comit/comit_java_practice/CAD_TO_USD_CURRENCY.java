package org.comit.comit_java_practice;

import java.util.Scanner;

public class CAD_TO_USD_CURRENCY {
	@SuppressWarnings("unused") // java annotation

	public static void main(String[] args) {
		// 17 - Write a program in Java that converts from
		// Canadian dollars to US dollars. You will receive a
		// decimal number corresponding to the amount in CAD and will answer with the
		// corresponding amount in US dollars.
		// Take the quotation of the dollar today. 4
		Scanner INPUTCAD=new Scanner(System.in);
		System.out.println("Enter your amount currency to exchange to US dollars");
		float CAD=INPUTCAD.nextFloat();
		float US;
		US=CAD*0.76040f;
		System.out.printf(CAD + " CAD is %f US dollars ",US);
		INPUTCAD.close();
	}

}
