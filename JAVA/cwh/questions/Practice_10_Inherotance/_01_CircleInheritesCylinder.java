package com.Practice_10_Inherotance;

class Circle01
{
	public void display()
	{
		System.out.println("i am a circle");
	}
}

class Cylinder01 extends Circle01
{
	public void display2()
	{
		System.out.println("i am a Cylinder");
	}
}

public class _01_CircleInheritesCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder01 ob= new Cylinder01();
		ob.display();
		ob.display2();
	}

}
