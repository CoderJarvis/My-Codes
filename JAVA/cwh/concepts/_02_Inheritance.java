package _01_PracticeConcept;

class Base1
{
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}

class Derived1 extends Base1
{
	private int b;

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
}

public class _02_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Derived1 ob=new Derived1();
		ob.setA(10); //base cls obj can access derived cls methods
		System.out.println("the number is "+ob.getA());

	}

}
