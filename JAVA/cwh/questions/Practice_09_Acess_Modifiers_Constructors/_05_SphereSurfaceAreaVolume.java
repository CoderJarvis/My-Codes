package com.Practice_09_Acess_Modifiers_Constructors;

class Sphere05
{
	double radius;



	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getSurfaceArea()
	{
		return 4*Math.PI*radius*radius;
	}
	
	public double getVolume()
	{
		return Math.PI*radius*radius*radius*4/3;
	}
	
}

public class _05_SphereSurfaceAreaVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sphere05 ob=new Sphere05();
		ob.setRadius(4.5);
		
		System.out.println("surface area "+ob.getSurfaceArea());
		System.out.println("volume ="+ob.getVolume());
		

	}

}
