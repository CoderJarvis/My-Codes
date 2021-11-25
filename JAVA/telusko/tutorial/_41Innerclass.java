package JavaTelusko;

class A41
{
	int i;
	
	class B41				//meberinner class
	{
		int j;
	}
}



class C41
{
	static int k;
	
	static class D41		//sttic inner class
	{
		int j;
	}
}



class phone41
{
	public void show()
	{
		System.out.println("call"); 	//Anonymous innr class
	}
	
}


interface Mobile41
{
	public void show();					//for lamba expression
}
public class _41Innerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		A41 ob1=new A41();
		ob1.i=10;
		A41.B41 ob2=ob1.new B41(); 		//member inner class object
		ob2.j=20;
		System.out.println(ob2.j);
		
		
		
		C41.k=11;
		C41.D41 ob3=new C41.D41();		//static inner class object
		ob3.j=22;
		System.out.println(ob3.j);
		
		
		phone41 ob4=new phone41()
				{
				public void show()
				{
					System.out.println("call,internet,wifi,games");		//Anonumous inner class
																		//show() method overriden
				}
				};
				ob4.show();
		
				
				
		Mobile41 ob5=()-> System.out.println("call,sms,internet,bluetooth,wifi,gaming");
		ob5.show();					//lamba expression saves code saves memorty
		
		
		
		
		
		
	}

}
