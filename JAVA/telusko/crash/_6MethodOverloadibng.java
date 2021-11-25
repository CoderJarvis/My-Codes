package teluskoCrash;
class Calculator6
{
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public void add(double a,double b,double c)
	{
		System.out.println(a+b+c);
	}
	
}

public class _6MethodOverloadibng {
	
public static void main(String[] args) {
	
	Calculator6 ob=new Calculator6();
	
	ob.add(10, 20);
	ob.add(11,22,33);
	ob.add(1.5,2.5,3.5);
}
}
