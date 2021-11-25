package JavaTelusko;

abstract class mahesh34
{
	public void call()
	{
		System.out.println("tha phone has call feaure");
	}
	
	public abstract void camera();
	public abstract void internet();
	public abstract void wifi();
}

abstract class ramesh34 extends mahesh34
{
	public void camera()
	{
		System.out.println("the phone has camera feature");
	}
	public abstract void internet();
	public abstract void wifi();
}

abstract class suresh34 extends ramesh34
{
	public void internet()
	{
		System.out.println("the phone has internet connection");
	}
	public abstract void wifi();
	
}

class ganesh34 extends suresh34	//class ganesh acquirs all the fwatures of above super clsses 
{
	public void wifi()
	{
		System.out.println("the phone has wifi function");
	}

}

public class _34AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		ganesh34 ob=new ganesh34();
		ob.internet();
		ob.wifi();
		ob.camera();
		ob.call();	
	}

}
