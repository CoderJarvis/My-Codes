package com.Practice_10_Inherotance;
class Rectangle02

{
	public void display()
	{
		System.out.println("i am a Rectangle");
	}
}

class Cuboid02 extends Rectangle02
{
	public void display2()
	{
		System.out.println("i am a Cuboid");
	}
}

public class _02_RectangleInheritsCuboid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuboid02 ob= new Cuboid02();
		ob.display();
		ob.display2();

	}

}
//package com.Practice_10_Inherotance;
//
//
//public class _04_extends02 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
