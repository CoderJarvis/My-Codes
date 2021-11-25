package JavaTelusko;

class Demo19
{   static int i=0; //we have to make it static otherwise all object has a copy of instances so how many objects u creat the output will be 0+1=1

						//i is a class variabe doesot depend upon object it is sharre between all objects
	public Demo19()
	{
		i++;
		
	}
	
	public void counter()
	{
		System.out.print(i);
	}
}
public class _19ObjectCount {
		public static void main(String[] args) {
			
			Demo19 ob1=new Demo19();
			Demo19 ob2=new Demo19();
			Demo19 ob3=new Demo19();
			Demo19 ob4=new Demo19();
			Demo19 ob5=new Demo19();
			Demo19 ob6=new Demo19();
			ob1.counter();
			
			
			
		}
}
