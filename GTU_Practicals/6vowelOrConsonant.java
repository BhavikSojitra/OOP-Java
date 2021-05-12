/* WAP that prompts the user to enter a letter and check whether a letter is a vowel or consonants. */

package OOPJ;
import java.util.Scanner;
public class VowelOrConsonant {
	    public static void main(String[] args) {
		  Scanner sc= new Scanner(System.in);
		  char c;
	 
	    System.out.println("Enter an alphabet: ");
	    c = sc.next().charAt(0);

	    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
	    	System.out.println(c+ " is a vowel.");
	    else
	    	System.out.println(c+ " is a consonant.");
	}
}
