/* WAP to read marks of five subjects. Calculate percentage and print class accordingly. 
Fail below 35, Pass Class between 35 to 45, Second Class between 45 to 60, First Class between 60 to 70, Distinction if more than 70. */

package OOPJ;

import java.util.Scanner;

public class FindPercentage {

	public static void main(String[] args) {
		Double per;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the marks of maths:");
		Double maths=sc.nextDouble();
		System.out.println("Enter the marks of English:");
		Double English=sc.nextDouble();
		System.out.println("Enter the marks of Social:");
		Double Social=sc.nextDouble();
		System.out.println("Enter the marks of Gujarati:");
		Double Gujarati=sc.nextDouble();
		System.out.println("Enter the marks of Hindi:");
		Double Hindi=sc.nextDouble();
		
		per=(maths+English+Social+Gujarati+Hindi)/5;
		
		if(per>=70)
			System.out.println("Distinction");
		else if (per>=60 && per<70)
			System.out.println("First class");
		else if (per>=45 && per<60)
			System.out.println("Second Class");
		else if (per>=35 && per<45)
			System.out.println("Pass class");
		else if (per<35)
			System.out.println("fail");
	}
}
