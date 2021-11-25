package teluskoCrash;
abstract class demo17
{
	public abstract void show();
	public void display()
	{
		
		
	}
}

class demo17_2 extends demo17
{
	public void show() {
		System.out.println("hy");
	}
}


public class _17AbstractClass {
	public static void main(String[] args) {
		demo17 ob=new demo17_2();
		ob.show();
		
	}
}
