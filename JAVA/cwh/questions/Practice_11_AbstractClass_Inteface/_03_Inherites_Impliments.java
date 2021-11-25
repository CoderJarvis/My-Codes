package com.Practice_11_AbstractClass_Inteface;

class Monkey3
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

interface BasicAnimal3
{
	void eat();
	void sleep();
}

class Human3 extends Monkey3 implements BasicAnimal3
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

public class _03_Inherites_Impliments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human3 ob= new Human3();
		ob.speak();
		ob.jump();
	}

}
