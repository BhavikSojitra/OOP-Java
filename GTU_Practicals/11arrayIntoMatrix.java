//WAP to read values in two-dimensional array and print them in matrix form
package OOPJ;

import java.util.Scanner;

public class arrayIntoMatrix {

	public static void main(String[] args) {
		
		int a[][], row, column;
		Scanner sc = new Scanner(System.in);
		
		//get row & column
		System.out.println("Enter number of row in 2D array: ");
		row = sc.nextInt();
		System.out.println("Enter number of column of 2D array: ");
		column = sc.nextInt();
		
		a = new int[row][column];
		
		//getting element in 2D array 
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				System.out.println("Enter elemrnt at a[" +(i+1)+"][" +(j+1)+ "]:");
				a[i][j] = sc.nextInt();
			}
		}
		
		//displaying 2d array
		System.out.println("\n Array in matrix Form :-");
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				System.out.println(a[i][j]+ "\t");
			}
			System.out.println();
		}
	}

}
