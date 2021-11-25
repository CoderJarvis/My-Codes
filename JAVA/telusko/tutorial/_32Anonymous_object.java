package JavaTelusko;

class A32
{	int k;
	public int show()
	{
		return 5;
	}
}

public class _32Anonymous_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A32().show();	//this object has no reference 
									//so called as anonyous object
			//memory only consumed in only heap & stack menory not affected 
										//method is called only once

			
		new A32().k=37;
		System.out.println(new A32().k);//not printing 32 coz there is 2 object created in the heap memory
		//in one k=32 and in 2 kvalue will be 0 beacuse here k is not assigned any value
}
}