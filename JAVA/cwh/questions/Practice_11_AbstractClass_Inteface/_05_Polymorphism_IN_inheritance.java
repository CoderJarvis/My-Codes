package com.Practice_11_AbstractClass_Inteface;
class Monkey5
{
	public void jump()
	{
		System.out.println("i can jump");
	}
	
	public void bite()
	{
		System.out.println("i can bite");
	}
}

interface BasicAnimal5
{
	void eat();
	void sleep();
}

class Human5 extends Monkey5 implements BasicAnimal5
{	
	public void speak()
	{
		System.out.println("i can speak");
	}
	public void eat()
	{
		System.out.println("i can eat because im an animals");
	}
	
	public void sleep()
	{
		System.out.println("i can sleep because im an animals");
	}
}


public class _05_Polymorphism_IN_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Monkey5 ob=new Human5();
		ob.jump();
	//	ob.sleep(); //not allowed reference is Monkey only Monkey class methods will be accesable
		
		BasicAnimal5 ob1=new Human5();
		ob1.eat();
		//ob1.jump(); //not allowed u are given this object by telling
	}	//this is a BasicAnimal //how can u jump//how can u access
		//monkey methods
}
