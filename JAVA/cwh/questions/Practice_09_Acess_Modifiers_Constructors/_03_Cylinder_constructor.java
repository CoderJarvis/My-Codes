package com.Practice_09_Acess_Modifiers_Constructors;

class Cylinder4
{
	private double radius,height;
	
	public Cylinder4(double x,double y)
	{
		radius=x;
		height=y; //initialization by the constructor
	}

	public double getRadius() {
		return radius;
	}

	public double getHeight() {
		return height;
	}


}

public class _03_Cylinder_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Cylinder4 ob=new Cylinder4(3.5,9.7);
			System.out.println("radius ="+ob.getRadius());
			System.out.println("height ="+ob.getHeight());
			
			
	}

}
