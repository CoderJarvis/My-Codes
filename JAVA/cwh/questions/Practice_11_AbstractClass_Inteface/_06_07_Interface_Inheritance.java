package com.Practice_11_AbstractClass_Inteface;

interface TvRmote6
{
	void color();
	void battryType();
}

interface SmartTvRemote6 extends TvRmote6
{
	void display();
	void Time();
}

class Tv6 implements TvRmote6
{
	public void color()
	{
		System.out.println("colour of the remote is black");
	}
	
	public void battryType()
	{
		System.out.println("this remotes uses pencil battry");
	}
}

public class _06_07_Interface_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv6 ob=new Tv6();
		ob.color();
		ob.battryType();
	//	ob.time(); //can't access time coz only implements TvRemote6

	}

}
