package com.Practice_13_Multithreading;


/**
 * 
 * @author DELL
 *
 */

class MyThread3 extends Thread
{
	public MyThread3(String s)
	{
		super(s);
	}
	public void run()
	{
		while(true)
		{
			System.out.println(getName());
		}
	}
}

/**
 * 
 * @author Saswatkumarsk
 * @version 1.3
 * 
 *
 */

public class _03_getPrioritysetPriority {
	//this is main method

	/**
	 * 
	 * @param args this is agrument
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread3 t1=new MyThread3("111111111111");
		MyThread3 t2=new MyThread3("222222222222");
		MyThread3 t3=new MyThread3("444444444444");
		MyThread3 t4=new MyThread3("555555555555");
		MyThread3 t5=new MyThread3("777777777777");
		
		t1.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t4.setPriority(Thread.MIN_PRIORITY);
		t5.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		System.out.println(t4.getPriority());
		System.out.println(t5.getPriority());
		
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
//		t5.start();
	}

}
