package com.Practice_13_Multithreading;
class Mythread1_1 extends Thread
{
	public void run()
	{
		while(true) {
			System.out.println("Good....Morning");
		}
	}
}
class Mythread1_2 extends Thread
{
	public void run()
	{
		while(true) {
			System.out.println("Welcome.....");
		}
	}
}

public class _01_Thread_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread1_1 t1=new Mythread1_1();
		Mythread1_2 t2=new Mythread1_2();
		
		t1.start();
		t2.start();
	}

}
