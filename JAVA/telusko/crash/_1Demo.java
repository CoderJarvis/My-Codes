package teluskoCrash;

import java.util.Scanner;

public class _1Demo {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("hello wordl");

		int a = 23;
		System.out.println(a);

		int b = 9;
		float c = 7.8f;
		double d = 34;

		System.out.println(a + b + c + d);

		long y = 500000000_0000000000l;
		System.out.println(y);

		char r = 'A';
		r = 66; // 66 is the ASCII value of B
		r = 67;
		System.out.println(r);

		int z = (int) 5.5;
		System.out.println(z);

		float xc = 8;
		System.out.println(xc);

		 int ab;
		 System.out.println("enter the number");
		 ab=sc.nextInt();
		 System.out.println("the enterd number is "+ab);

		int p = 11;
		int q = 22;

		q = p++;

		System.out.println(p);
		System.out.println(q);

		int i = 8;

		int j = i > 6 ? 2 : 3;
		System.out.println(j);

		int n;

			for(int e=5;e>=1;e--) {
			for (int w = 1; w <= 5; w++) {
				System.out.print("* ");
			}
			System.out.println();
			}
	}
}
