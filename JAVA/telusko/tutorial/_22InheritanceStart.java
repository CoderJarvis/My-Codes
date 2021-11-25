package JavaTelusko;

class A22
{
	int a,b,result;
	
	public void addition()
	{
		result=a+b;
	}
}



public class _22InheritanceStart {
	
	public static void main(String[] args) {
		
		A22 ob=new A22();
		ob.a=10;
		ob.b=20;
		
		ob.addition();
		
		System.out.println(ob.result);
	}

}
