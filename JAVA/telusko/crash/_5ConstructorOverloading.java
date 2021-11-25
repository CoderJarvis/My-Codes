package teluskoCrash;		//constructor overloading
class A5
{	int i;
	
	
	A5()
	{
		i=10;
	}
	A5(int a)
	{
		i=a;
	}
	A5(int a,int b)
	{
		
		System.out.print(a+b);
	}
	
	A5(int a,int b,double c)
	{
		System.out.println(a+b+c);
	}
}
public class _5ConstructorOverloading {
public static void main(String[] args) {
	

	
	A5 ob = new A5(10,20,1);
	
	
}
}
