/* WAP to make a Simple Calculator using switch...case. */

package OOPJ;

import java.util.Scanner;

public class CalculatorUsingSwitch {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Two Numbers:");
		
		double first =sc.nextDouble();
		double second=sc.nextDouble();
		
		System.out.println("Enter any one Operator +, -, *, / :");
		char operator = sc.next().charAt(0);
		
		double result;
		
		switch(operator) {
		case'+':
			result= first+second;
			break;
			
		case'-':
			result= first-second;
			break;
			
		case'*':
			result= first*second;
			break;
			
		case'/':
			result= first/second;
			break;
			
		default:
			System.out.println("Error Try again!");
			return;
		}
		
		System.out.println(first+" " + operator + " " + second + " = " + result);
		
	}

}
