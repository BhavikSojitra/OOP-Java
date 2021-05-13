/* Write a Program that displays Welcome to Java, Learning Java Now and Programming is fun. Create a class named Candidate with Candidate_ID, 
Candidate_Name, Candidate_Age, Candidate_Weight and Candidate_Height data members. Also create a method GetCandidateDetails() and 
DisplayCandidateDetails(). Create main method to demonstrate the Candidate class. */

package OOPJ;

import java.util.Scanner;

class Candidate{
	
int CandidateID;
int CandidateAge;
int CandidateWeight;
String CandidateName;
double CandidateHeight;

Scanner sc = new Scanner(System.in);

void getCandidateDetails() {
	System.out.println("Enter Candidate ID: ");
	CandidateID = sc.nextInt();
	System.out.println("Enter Candidate Name: ");
	sc.nextLine();
	CandidateName = sc.nextLine();
	System.out.println("Enter Candidate Age: ");
	CandidateAge = sc.nextInt();
	System.out.println("Enter Candidate Wight: ");
	CandidateWeight = sc.nextInt();
	System.out.println("Enter Candidate Height: ");
	CandidateHeight = sc.nextDouble();
}

//display details method
void displayCandidateDetails() {
	System.out.println("\n Candidate Details:-");
	System.out.println("Candidate ID: " +CandidateID);
	System.out.println("Candidate Name: " +CandidateName);
	System.out.println("Candidate Age: " +CandidateAge);
	System.out.println("Candidate Weight: " +CandidateWeight);
	System.out.println("Candidate Height: " +CandidateHeight);
	
}
}

public class candidateClass {

	public static void main(String[] args) {

		Candidate cn = new Candidate();
		
		cn.getCandidateDetails();
		cn.displayCandidateDetails();
			
		}
}
