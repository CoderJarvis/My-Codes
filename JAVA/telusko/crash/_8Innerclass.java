package teluskoCrash;
class outer8
{
	int i;
	int j;
	
	public void show()
	{
		System.out.println("outer function");
	}
	
	class inner
	{
		public void display()
		{
			System.out.println("this is the inner class");
		}
		
		
	}
	
	static class inner2
	{
		public void display3()
		{
			System.out.println("this is static inner class");
			
		}

	}
	
	
	
}
public class _8Innerclass {
public static void main(String[] args) {
	
	outer8 ob1=new outer8();
	ob1.show();
	outer8.inner ob2=ob1.new inner();
	outer8.inner2 ob3=new outer8.inner2();
	ob2.display();
	ob3.display3();
	
	
}
}
