package com.Practice_08_OOP;

class Cellphone2
{
	public void ring()
	{
		System.out.println("Your phone is ringing");
	}
	
	public void vibrate()
	{
		System.out.println("Your phone is vibrating");
	}
}
public class _02_Cellphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cellphone2 ob=new Cellphone2();
		ob.ring();
		System.out.println();
		ob.vibrate();
		
	}

}
