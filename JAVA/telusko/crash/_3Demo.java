package teluskoCrash;  //constructor

class _3A
{
	int i;
	double j;
	
double result;
	
	public _3A()
	{
		i=5;
		j=6.5;
		result=i+j;
	}
	
	_3A(int x,int y)
	{
		i=x;
		j=y;
		
		result=i+j;
	}
	
}



public class _3Demo {
	
	public static void main(String[] args) {
		
		_3A ob=new _3A();
		
		System.out.println(ob.i);
		System.out.println(ob.j);
		System.out.println(ob.result); 
		
	
	}

}
