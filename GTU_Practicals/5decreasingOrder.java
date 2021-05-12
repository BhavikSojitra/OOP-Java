/* Write a program that prompts the user to enter three integers and display the integers in decreasing order. */

package OOPJ;

import java.util.*;

public class DecreasingOrder {
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		int no1=sc.nextInt();
		System.out.println("Enter Second Number:");
		int no2=sc.nextInt();
		System.out.println("Enter third Number:");
		int no3=sc.nextInt();
		
		Integer arr[]=new Integer[3];
		arr[0]=no1;
		arr[1]=no2;
		arr[2]=no3;
		
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(arr[0]+" "+ arr[1] + " " + arr[2]);
	}
}

/*
public class DecreasingOrder {

public static void main(String[] args) {
	
	System.out.println("Enter 3 number:");
	
	Scanner sc=new Scanner(System.in);
	
	int[] num = new int[3];
	
	num[0] = sc.nextInt();
	num[1] = sc.nextInt();
	num[2] = sc.nextInt();
	
	Arrays.sort(num);
	System.out.println("number in Decreasing order are:");
	for(int i=(num.length -1); i>=0; i--) {
		System.out.println("%d", num[i]);
	}
}
}
*/
