package com.Practice_08_OOP;
class Rectangle04
{
	int length,breadth;
	
	public void setSides(int x,int y)
	{
		length=x;
		breadth=y;
	}
	
	public int getArea()
	{
		return length*breadth;
	}
	
	public int getPerimeter()
	{
		return 2*(length+breadth);
	}
}

public class _04_Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle04 ob=new Rectangle04();
		ob.setSides(20, 10);
		System.out.println("Area of the Rectangle is "+ob.getArea());
		System.out.println("Perimeter of the Rectangle "+ob.getPerimeter());

	}

}
