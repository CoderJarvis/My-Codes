package teluskoCrash; //single lvl inh 
class Calculator12 	//base	super
{
	public int add(int a,int b)
	{
		return a+b;
	}
}

class Calculatorrvadv12 extends Calculator12 //derived sub

{
	public int sub(int a,int b)
	{
		return a-b;
	}
}

class Calculatorrveryadv12 extends Calculatorrvadv12 //multiple inheritance
{
	public int mul(int a,int b)
	{
		return a*b;
	}
}

public class _12Inheritance {
	public static void main(String[] args) {
		Calculator12 ob1=new Calculator12();
		System.out.println(ob1.add(2,3));
		Calculatorrveryadv12 ob2=new Calculatorrveryadv12();
		System.out.println(ob2.mul(5, 4));
		

	} 
}
