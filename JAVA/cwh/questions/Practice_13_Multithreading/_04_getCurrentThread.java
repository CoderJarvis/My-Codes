package com.Practice_13_Multithreading;
class MyThread4 extends Thread
{
	public void run()
	{
		System.out.println("Welcome......");
	}
}

public class _04_getCurrentThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread4 t1=new MyThread4();
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
		System.out.println(Thread.currentThread().getState());
		
		
		
		
		
	}

}
