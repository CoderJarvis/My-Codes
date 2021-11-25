package com.Practice_08_OOP;

class Circle06
{
	double radius;
	
	public void setRadius(double x)
	{
		radius=x;
	}
	
	public double getArea()
	{
		return 3.141f*radius*radius;
	}
	
	public double getPerimeter()
	{
		return 2*3.141f*radius;
	}
	
//	area= 28.269001
//	perimeter= 18.846


	
	
}

public class _06_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle06 ob=new Circle06();
		ob.setRadius(3);
		System.out.println("area= "+ob.getArea());
		System.out.println("perimeter= "+ob.getPerimeter());
		
	}

}
