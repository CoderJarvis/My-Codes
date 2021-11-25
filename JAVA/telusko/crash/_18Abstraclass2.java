package teluskoCrash;
class demo18
{
	public void setvalue(Number i) //the abstract class Number is super class od datatypes like int foat double etc
	{								//why to use two or methiod to accetp diffet value tpes we can use a one abstract class and thias is super class od all sub classes like int floa fos
		System.out.println(i);
		
	}

}
public class _18Abstraclass2 {
public static void main(String[] args) {
	
	demo18 ob=new demo18();
	ob.setvalue(89.6);
}
}
