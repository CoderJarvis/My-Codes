package com.Practice_13_Multithreading;
class Mythread2 extends Thread
{
	public void run()
	{
		while(true) {
			System.out.println("Good....Morning");
		}
	}
}
class MyNewthread2 extends Thread
{
	public void run()
	{
		while(true) {
			try {
				Thread.sleep(5);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println("Welcome.....");
		}
	}
}

public class _02_Thread_sleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread2 t1=new Mythread2();
		MyNewthread2 t2=new MyNewthread2();
		
		t1.start();
		t2.start();
	}
}
