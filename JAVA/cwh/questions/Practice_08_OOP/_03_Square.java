package com.Practice_08_OOP;

class Square03
{
	int side;
	
	public void setSide(int a)
	{
		side=a;
	}
	
	public int getArea()
	{
		return side*side;
	}
	
	public int getPerimetere()
	{
		return 4*side;
	}
	
}

public class _03_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Square03 ob = new Square03();
		ob.setSide(6);
		System.out.println("Arear of the square is "+ob.getArea());
		System.out.println("Perimeter of the square is "+ob.getPerimetere());
		
	}

}
