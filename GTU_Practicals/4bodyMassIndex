/* Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters. 
Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI.
Note:- 1 pound=.45359237 Kg and 1 inch=.0254 meters. */

package OOPJ;

import java.util.Scanner;

public class bodyMassIndex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Weight in pounds: ");
		double weight = sc.nextDouble();
		System.out.println("Enter Height");
		double height = sc.nextDouble();
		
		double weightKG = weight*0.45359237;
		double heightMeter = height*0.0254;
		
		double BMI = weightKG/(heightMeter*heightMeter);
		System.out.println("Body Mass Index : "+ BMI);
	}

}
