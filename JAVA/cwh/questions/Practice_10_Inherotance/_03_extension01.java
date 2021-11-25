package com.Practice_10_Inherotance;



class Circle03
{	
	protected double radius;
	public Circle03()
	{
		System.out.println("i am cylinder's circle");
	}
	
	public Circle03(double x)
	{
		this.radius=x;
	}
	
	public double getAreaCircle()
	{
		return Math.PI*this.radius*this.radius;
	}
	
}

class Cylinder03 extends Circle03
{
	
	private double height;
//	public void Cylinder03()
//	{
//		System.out.println("i am the Cylinder");
//	}
	
	public Cylinder03(double x,double y)
	{
		super(x);
		height=y;
	}
	
	
	public double getSurfaceareaOfCylinder()
	{
		return 2*Math.PI*(height+radius);
	}
	public double getVolumeOfCylinder()
	{
		return Math.PI*radius*radius*height;
	}
	

	
	

}

public class _03_extension01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cylinder03 ob=new Cylinder03(10.5,20.5);
		System.out.println("surface area of the cylinder "+ob.getSurfaceareaOfCylinder());
		System.out.println("volume of the cylinder "+ob.getVolumeOfCylinder());
		System.out.println("arae of cylinder's one of the circles "+ob.getAreaCircle());
		
	
	}

}

//cylinder has height and radius..to calculate its one of circle's area 
//we send radius to its base class by super(radius)
