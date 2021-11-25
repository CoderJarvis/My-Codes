package com.Practice_09_Acess_Modifiers_Constructors;
class Cylinder02
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
	
	public float getSurfaceArea()
	{
		return 2*(float)Math.PI*radius*(height+radius);
				
	}
	
	public float getVolumeOfCylinder()
	{
		return (float)Math.PI*radius*2*height;
	}
}

public class _02_Cylinder_SurfacearaeVoume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cylinder02 ob=new Cylinder02();
		ob.setRadius(3.5f);
		ob.setHeight(5.7f);
		
		System.out.println("surface area "+ob.getSurfaceArea());
		System.out.println("vloume "+ob.getVolumeOfCylinder());

	}

}
