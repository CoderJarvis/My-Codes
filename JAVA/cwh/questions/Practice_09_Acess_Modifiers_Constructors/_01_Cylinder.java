package com.Practice_09_Acess_Modifiers_Constructors;

class Cylinder01
{
	private float radius,height;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	
}

public class _01_Cylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cylinder01 ob=new Cylinder01();
		ob.setRadius(3.5f);
		ob.setHeight(5.7f);
		
		System.out.println("radius = "+ob.getRadius());
		System.out.println("height ="+ob.getHeight());
		
	

	}

}
