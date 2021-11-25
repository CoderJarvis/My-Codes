package JavaTelusko;

class A31
{
	private int x;
	public void show(int x)
	{
		this.x=x; //when agrument variable and data variabe are same element
	}
	
	public void display()
	{
		System.out.println(x);
	}
}



public class _31ThisKeyword {
public static void main(String[] args) {
	
	A31 ob=new A31();
	ob.show(18);
	ob.display();
	
	
	
}
}
