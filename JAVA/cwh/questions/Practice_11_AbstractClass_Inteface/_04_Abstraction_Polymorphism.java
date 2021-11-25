package com.Practice_11_AbstractClass_Inteface;

abstract class Telephone4
{	public void keypad()
	{
		System.out.println("telephone has keypad");
	}
	abstract public void ring();
	abstract public void connect();
	abstract public void disconnect();
}

class SmartTelephone4 extends Telephone4
{

	@Override
	public void ring() {
		// TODO Auto-generated method stub
		System.out.println("the call is ringing");
		
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("the call is connected");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("the call is disconnected");
	}
	
}

public class _04_Abstraction_Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartTelephone4 ob= new SmartTelephone4();
		ob.ring();
		ob.connect();
		ob.disconnect();
		System.out.println();
		ob.keypad();
		System.out.println();
		
		Telephone4 ob1=new SmartTelephone4();//reference of parent
		ob1.keypad();					//object of child
		ob1.ring();
		ob1.disconnect();//here reference of
		//parent abstract method can access everything
		//because here reference of parent knows every
	}	//reference of Telephone4 class knows everything

}
