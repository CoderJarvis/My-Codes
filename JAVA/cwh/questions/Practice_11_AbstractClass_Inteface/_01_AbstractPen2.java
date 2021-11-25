package com.Practice_11_AbstractClass_Inteface;

abstract class Pen2
{
	abstract public void write();
	abstract public void refill();
}

class FountainPen extends Pen2{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("i can write");
	}

	@Override
	public void refill() {
		// TODO Auto-generated method stub
		System.out.println("it can be refilled when nib is ran out");
	}
	
	public void changeNib()
	{
		System.out.println("you can also change its nib");
	}
	
}

public class _01_AbstractPen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FountainPen ob=new FountainPen();
		ob.refill();

	}

}
