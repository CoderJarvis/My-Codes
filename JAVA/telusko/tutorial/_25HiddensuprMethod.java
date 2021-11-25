package JavaTelusko;

class A25 extends Object{
	public A25() {
		System.out.println("in class A");
	}

	public A25(int a) {
		System.out.println("in class A with int");
	}

}

class B25 extends A25 {

	public B25() {
		System.out.println("in class B");
	}

	public B25(int a)

	{
		super(); // in every constructor in java there is a hdden super() method
					// which calls super class's default constructor
		System.out.println("in class B int");
	}
}

public class _25HiddensuprMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B25 ob = new B25(8); // whenever you create a object of sub class
								// it alwys calls the default constructor of super class
								// because of hidden super() method

	}

}
