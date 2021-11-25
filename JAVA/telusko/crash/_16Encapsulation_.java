package teluskoCrash; //getter and settesr
class A16
{
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	
}

public class _16Encapsulation_ {
	public static void main(String[] args) {
		A16 ob=new A16();
		ob.setRollno(30);
		ob.setName("saswat");
		
		System.out.println(ob.getRollno());
		System.out.println(ob.getName());
		
		  int x=7;

		    System.out.println(++x * x++);
		    System.out.println(x);
		
	}
	


}
