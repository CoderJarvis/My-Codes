package JavaTelusko;

class Demo21
{
	private int roll;	//encapsulation tells every variables must be private
	private String sname; //and the variables are should be accessed by methods
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
}


public class _21EncapsulationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo21 ob=new Demo21();
		ob.setRoll(30);
		ob.setSname("Saswat");
		System.out.println(ob.getRoll());
		System.out.println(ob.getSname());
	
	}

}
