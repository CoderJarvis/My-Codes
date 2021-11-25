package JavaTelusko;

public class _06Fibonacci {
	public static void main(String[] args) {
		
		int a=1,b=1,k=0;
		int n=100;
		
		System.out.print("the fibonacci series :"+a+" "+b+" ");
		
		
		
		while( k<=n)
		{
		k=a+b;
		if(k>n)
			break;
		
			System.out.print(k+" ");
			a=b;
			b=k;
		}
		
	}

}
