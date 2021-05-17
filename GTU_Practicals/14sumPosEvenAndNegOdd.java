/* 14. WAP program to calculate the sum of all positive even numbers and the sum of all negative odd numbers from a set of numbers. 
   You can enter 0 (0zero) to quit the program and thus it. displays the result.  */

package OOPJ;

import java.util.Scanner;

public class sumPosEvenAndNegOdd {

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int sum1=0,sum2=0,num = -1;
	while(num!=0){
		System.out.println("Enter Positive even or Negative odd:");
		num = sc.nextInt();
		if((num >0) && (num%2==0)) {
			sum1 += num;
		}else if((num <0) && (num%2 != 0)) {
			sum2 += num;
		}else if(num ==0) {
			System.out.println("Positive sum:"+sum1+"\nNegative sum:"+sum2);
			break;
		}
	}
}
}
