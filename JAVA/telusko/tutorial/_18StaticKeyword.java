package JavaTelusko;

class Demo18 {
	static int b;
	static int a; // static variable

	public static void main() // static method
	{
		System.out.println("hy static method executed succesfully");
		b = 34;
	}

	// object is not used to initialize static variables and static methods
	// can be called only by class name

	public void display() {
		System.out.println("non static method executed");//to call this
	}
}

public class _18StaticKeyword {
	public static void main(String[] args) {
		Demo18.a = 156;
		System.out.println(Demo18.a);
		System.out.println();
		Demo18.main();
		System.out.println();
		Demo18 ob = new Demo18();
		ob.display();
	}
}
