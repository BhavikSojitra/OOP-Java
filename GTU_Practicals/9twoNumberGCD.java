package OOPJ;
import java.util.Scanner;
public class twoNumberGCD {
	    public static int gcd(int num1, int num2)
	    {
	          while (num1 != num2) 
	          {
	                 if(num1 > num2)
	                  {
	                      num1 = num1 - num2;
	                  }
	                  else
	                  {
	                       num2 = num2 - num1;
                     }
        	  }
	   return num1;
	   }
  	 public static void main(String[] args) 
	   {
	          Scanner input = new Scanner(System.in);
	          System.out.print("Enter First Number  : ");
        	  int number1 = input.nextInt();
	          System.out.print("Enter Second Number : ");
	          int number2 = input.nextInt();
	           System.out.print("GCD of "+number1+" and "+number2+" = "+gcd(number1, number2));
	   }
}
