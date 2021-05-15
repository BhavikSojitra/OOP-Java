/* WAP to store numbers in 4 X 4 matrix in a two-dimensional array. 
Find the sum of the numbers of each row and the sum of numbers of each column of the matrix. */

package OOPJ;

import java.util.Scanner;

public class matrixRowColSum {

	public static void main(String[] args) {
		
		int a[][], row, column, columnSum[], rowSum[];
		Scanner sc = new Scanner(System.in);
		
		//Get row and column
		System.out.println("Enter number of row of 2D array : ");
		row = sc.nextInt();
		System.out.println("Enter number of columns of 2D array : ");
		column = sc.nextInt();
		
		a = new int[row][column];
		rowSum = new int[row];
		columnSum = new int[column];
		
		//Getting elements of 2D array
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				System.out.println("Enter element at a[" +(i+1)+ "][" +(j+1)+ "] : ");
				a[i][j] = sc.nextInt();
			}
		}
		
		
		//Adding Sum
		for(int i=0; i<row; i++) {
			rowSum[i] = columnSum[i] = 0;
			for(int j=0; j<column; j++) {
				rowSum[i] += a[i][j];
				columnSum[i] += a[j][i];
			}
		}
		
		//Displaying 2D array with sums
		System.out.println("\nArray in Matrix From :-");
		for(int i=0; i<=row; i++) {
			for(int j=0; j<column; j++) {
				if(i == row)
					System.out.println(columnSum[j]+"\t");
				else
					System.out.println(a[i][j]+"\t");
			}
			if(i != row)
				System.out.println(rowSum[i]);
		}
	}
}
