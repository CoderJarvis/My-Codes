package com.Practice_08_OOP;

class Employee01
{
	int salary;
	String name;
	
	public void setName(String s)
	{
		name=s;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getsalary()
	{
		return salary;
	}
	
	
	
	
}

public class _01_Employess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee01 ob=new Employee01();
		ob.setName("samay");
		System.out.println(ob.getName());
		ob.salary=50_000;
		System.out.println(ob.getsalary());

	}

}
