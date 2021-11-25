package com.Practice_09_Acess_Modifiers_Constructors;
class Rectangle04
{
	private int length,breadth;
	
	public Rectangle04()
	{
		length=0;
		breadth=0;
	}
	
	public Rectangle04(int x,int y)
	{
		length=x;
		breadth=y;
		
	}

	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}


	
	
}

public class _04_Constrctor_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle04 ob=new Rectangle04(3,4);
		System.out.println(ob.getLength());
		System.out.println(ob.getBreadth());
		

	}

}
