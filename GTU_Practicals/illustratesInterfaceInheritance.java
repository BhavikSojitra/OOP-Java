/*16. Write a program that illustrates interface inheritance.Interface P is extended by P1 and P2. Interface P12 inherits from both P1 ans P2.
  		Each interface declares one constant and one method. Classe Q implements P12.Instantiate Q and invokes each of its methods. Each method displays one of the constants.*/

package OOPJ;

interface P{
	final int p=5;
	void methodP();
}
interface P1 extends P{
	final int p1=10;
	void methodP1();
}
interface P2 extends P{
	final int p2=20;
	void methodP2();
}
interface P12 extends P1,P2{
	final int p12=12;
	void methodP12();
}
class Q implements P12{
	public void methodP() {
		System.out.println("methodP :"+p1);
	}
	public void methodP1() {
		System.out.println("methodP1 :"+p2);
	}
	public void methodP2() {
		System.out.println("methodP2 :"+p12);
	}
	public void methodP12() {
		System.out.println("methodP :"+p);
	}
}
public class illustratesInterfaceInheritance {

	public static void main(String[] args) {
		
		Q q=new Q();
		q.methodP();
		q.methodP1();
		q.methodP2();
		q.methodP12();
	}
}
