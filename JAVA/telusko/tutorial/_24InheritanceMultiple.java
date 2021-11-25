package JavaTelusko;

class A24
{

	int a,b,c,result;
	
	public void addition()
	{
		result=a+b;
	}
}


class B24 extends A24	//all proprties of A class acquared by B
{
	

	
	
	
	public void sub()
	{
		result=a-b;
	}
}

class C24 extends B24 //now all properties of a & b acquiered by C
{
	public void mul()
	{
		result=a*b*c;
	}
}



public class _24InheritanceMultiple {
public static void main(String[] args) {
	{
		C24 ob=new C24();
		ob.a=10;
		ob.b=20;
		ob.c=30;
		ob.sub();
		System.out.println(ob.result);
		
		
	}
}
}
