/* Write a program for calculator to accept an expression as a string in which the operands and operator are separated by zero or more spaces.
   For ex: 3+4 and 3 + 4 are acceptable expressions  */

package OOPJ;

import java.util.Scanner;

public class separatedBySpace13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Equation : ");
		String string = input.nextLine();
		String a = string.replaceAll(" "," ");
		
		if (a.length() < 3) {
			System.out.println("Minimum 2 operator and 1 opearand Required");
			System.exit(0);
		}
		
		int result = 0;
		int i = 0;
		while(a.charAt(i)!='+' && a.charAt(i)!='-' && a.charAt(i)!='*' && a.charAt(i)!='/')
		{
			i++;
		}
		switch(a.charAt(i)) {
			case '+' :
				result = Integer.parseInt(a.substring(0,i))+Integer.parseInt(a.substring(i=1,a.length()));
				break;
			case '-' :
				result = Integer.parseInt(a.substring(0,i))-Integer.parseInt(a.substring(i+1,a.length()));
				break;
			case '*' :
				result = Integer.parseInt(a.substring(0,i))*Integer.parseInt(a.substring(i+1,a.length()));
				break;
			case '/' :
				result = Integer.parseInt(a.substring(0,i))/Integer.parseInt(a.substring(i+1,a.length()));
				break;
		}
		System.out.println(a.substring(0,i)+ ' ' + a.charAt(i) + ' ' + a.substring(i+1,a.length())+ " = " + result);

	}

}
