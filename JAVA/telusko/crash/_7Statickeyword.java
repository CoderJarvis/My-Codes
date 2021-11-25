package teluskoCrash;

class emp7
{
	int eid;
	int esal;
	static String ceo;
	
	public void show()
	
	{
		System.out.println(eid+":" + esal+":"+ceo);
	}
}

public class _7Statickeyword {
public static void main(String[] args) {
	
	emp7 samay=new emp7();
	emp7 vidit=new emp7();
	
	
	samay.eid=1;
	samay.esal=1000;
	emp7.ceo="suhani";
	
	vidit.eid=2;
	vidit.esal=2000; 
	emp7.ceo="sagar";  //as they are same company ceo should be one ... u can use class name as well as object name
	
	samay.show();
	vidit.show();
	
	
}
}
