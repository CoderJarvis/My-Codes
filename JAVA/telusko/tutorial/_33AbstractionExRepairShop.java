package JavaTelusko;

abstract class phone33
{
	abstract public void processor();
	abstract public void camera();
	
}

class samsung33 extends phone33
{
	public void processor()
	{
		System.out.println("samsung has exynous processor");
	}
	
	public void camera()
	{
		System.out.println("samsung has 15mp camera");
	}
}
class iphone33 extends phone33
{
	public void processor()
	{
		System.out.println("iphone has apple processor");
	}
	
	public void camera()
	{
		System.out.println("iphone  has 50mp camera");
	}
}

public class _33AbstractionExRepairShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iphone33 ob=new iphone33();
		samsung33 ob1=new samsung33(); //doubt where is psvm(phone ob) ???
		ob1.camera();
		
	}
	

}
