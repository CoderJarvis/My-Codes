package JavaTelusko;

public class _09Prime {
public static void main(String[] args) {
	int n=21;
	boolean flag=true;
	
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			flag=false;
		}
	}
	
	if(flag)
	{
		System.out.println("prime no");
	}
	else 
		System.out.println("not prime");
	
}
}
