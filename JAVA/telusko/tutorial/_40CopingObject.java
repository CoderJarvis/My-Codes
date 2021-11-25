package JavaTelusko;

class A40
{
	int i;
	int j;
}

public class _40CopingObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A40 ob1=new A40();
		ob1.i=4;
		ob1.j=5;
		
		System.out.println("ob1 i : "+ob1.i+"	ob1 j : "+ob1.j);
		
		
		
		A40 ob2=new A40();
		
//		ob2=ob1;
//		ob2.i=10;
//		System.out.println("i : "+ob1.i+"\nj : "+ob1.j); 
//		
//		shallow copy :2 references one onject
//		whoever changes the vlaue it reflects	
	
	
	ob2.i=ob1.i;
	ob2.j=ob1.j;
	
	System.out.println("ob2 i : "+ob2.i+"	ob2 j : "+ob2.j);
	
	System.out.println("ob2.i updated");
	ob2.i=50;
	System.out.println("ob1 i : "+ob1.i+"	ob1 j : "+ob1.j);
	System.out.println("ob2 i : "+ob2.i+"	ob2 j : "+ob2.j); 
	
	//ob2.i updates and ob1.i remains same but this requirs a lot of codes
	//deep coping
	
//		A40 ob2=new A40();
//	ob2=(A40)ob1.clone();
	
	
	
	
	
	
	}

}
