package practice_file_11;

import java.util.Random;
import java.util.Scanner;

public class Executable {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("enter your name: ");
		String name1 = input.nextLine();
		System.out.println("your age: ");
		int age1 = input.nextInt();
		System.out.println("your weight: ");
		float weight1 = input.nextFloat();
		System.out.println("your hight: ");
		float height1 = input.nextFloat();
		System.out.println("your gender:");
		//*char gender1 = input.nextLine();
		//Random id1 = new Random();
		Person person1 = new Person(name1,age1, height1, weight1, 'F');
	  System.out.println(  person1.toString());
	  
	  int check;
	  check=person1.Calculate()	;
	  if(check==1)
		  System.out.println("over weight");
	  else if(check==0)
	  System.out.println("ideal");
	  else 
	  System.out.println("below weight");
	  
	
	}
}