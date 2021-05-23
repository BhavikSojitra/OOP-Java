/* Write a program that generates custom exception if any integer value given from its command line arguments is negative.*/

package OOPJ;

class NegativeNumberException extends Exception { 
private int detail; 
  NegativeNumberException(int a) {
    detail = a;
  }
  public String toString() {
    return "NegativeNumberException [" + detail + "]";
  }
}

class customException {
public static void main(String args[]) { 
   try {
        int n = Integer.parseInt(args[0]);
        if(n < 0)
        {
          throw new NegativeNumberException(n);
        }
        else
        {
          System.out.println("You have entered positive number...");
        }
   }   
   catch (NegativeNumberException e)
   {
        System.out.println("Caught " + e);
   }
  }
}
