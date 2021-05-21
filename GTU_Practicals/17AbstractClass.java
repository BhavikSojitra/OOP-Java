/* Write a program to define abstract class, with two methods addition () and substraction(), addition() is abstract method.
      Implement the abstract method and call that method using a program.*/

package OOPJ;
import java.util.*;
abstract class eval{
	abstract int addition(int a,int b);

	 static int substraction(int a,int b){
	 	return (a-b);
	}
}
class evaluate extends eval{
	public int addition(int a,int b){
		return (a+b);
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		evaluate q  = new evaluate();
    	int sum = q.addition(3,5);
    	int diff = q.substraction(5,3);
        System.out.println(sum + "  " + diff );

	}

}
