package teluskoCrash;

class emp7_2
{
	int eid;
	int esal;
	static String ceo;
	
	emp7_2()			//use constructor to initialize non static variables//created when u creat an object
	{
		eid=3;
		esal=3000;
	}
	
	static		//use static block to initialize static variables//created when load a class to class loader
	{
		ceo="zukerberg";
	}
	
	public void show()
	
	{
		System.out.println(eid+":" + esal+":"+ceo);
	}
}

public class _7Statickeyword2 {
	
	public static void main(String[] args) {
		
		emp7_2 ob=new emp7_2();
	
		
		ob.show();
		
	}

}
