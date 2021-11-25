package JavaTelusko;

public class _07Palindrome {
public static void main(String[] args) {
	
	int n,t,r,sum;
	n=454;
	sum=0;
	t=n;
	
	while(n>0)
	{
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	
if(t==n)
	System.out.println("palimdrome");
	else 
		System.out.println("not");
	

}
}
