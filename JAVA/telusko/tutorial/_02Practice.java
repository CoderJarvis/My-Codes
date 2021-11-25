package JavaTelusko;

public class _02Practice {
public static void main(String[] args) {
	char c='A';
	System.out.println((int)c); //explicit type conversion
	double a=6.7;
	System.out.println((int)a); //implicit type conversion
	
	int u=0B1000;
	int j=0B1000_000_000; 	//to differentiate use underscore
	System.out.println(u+" "+j);
	
	int p=25,q=15;
	int r=p & q;	//bitwise and bitwise or
	
	System.out.println(r);
	
	
	int s=15;
	System.out.println(s>>1);	//right shieft and left shieft
	System.out.println();
	 int i=4;
	 
	 System.out.println(--i );
	 System.out.println(i);
	 
	 System.out.println(1/2);
	 double d=1/2;
	 System.out.println(d);
	 int z=1/2;
	 System.out.println(z);
	 
	 
}
}