package JavaTelusko;
class A23
{
	int a,b,result;
	
	public void addition()
	{
		result=a+b;
	}
}


class B23 extends A23	//all proprties of A class acquared by b
{
	public void sub()
	{
		result=a-b;
	}
}
public class _23InheritanceSingle {
public static void main(String[] args) {
	
	B23 ob=new B23();
	ob.a=10;
	ob.b=20;	//can access class a members through class b object
	
	ob.sub();
	System.out.println(ob.result);
	
}
}
