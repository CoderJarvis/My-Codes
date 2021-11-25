package JavaTelusko;

 class Demo16
{
	protected int i=95;	//protected specifier
	
}

class A16 extends Demo16
{
	public A16()
	{
		System.out.println(i); //derived class can only acces the 
		//protected data members of a super class
	}
}
public class _16AcessModifiers {
public static void main(String[] args) {
	A16 ob=new A16();
	
}
}
