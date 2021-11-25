package com.Practice_10_Inherotance;
class Rectangle04
{
	protected int length,height;

	
	public Rectangle04(int x,int y)
	{
		length=x;
		height=y;
	}
	
	public int getRectangleArea()
	{
		return length*height;
	}
	
	public int getRectanglePerimeter()
	{
		return 2*(length+height);
	}
	
	
}

class Cuboid04 extends Rectangle04
{
	
	protected int width;
	
	public Cuboid04(int x,int y,int z)
	{
		super(x,y);
		width=z;
	}

	public int getCuboidSurfaceArea()
	{
		return 2*(width*length+height*length+height*width);
	}
	
	public int getCuboidvolume()
	{
		return width*height*length;
	}

}


public class _04_extendsFrom02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuboid04 ob=new Cuboid04(10, 20, 30);
		
		System.out.println("surface area f the cuboid= "+ob.getCuboidSurfaceArea());
		System.out.println("volume of the cuboid= "+ob.getCuboidvolume());
		System.out.println();
		System.out.println("area of the rectangle= "+ob.getRectangleArea());
		System.out.println("perimeter of the rectangle= "+ob.getRectanglePerimeter());


	}

}
