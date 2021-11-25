package _01_PracticeConcept;

class Employee01
{
	private int id;
	private String name;
	
	public Employee01()
	{
		id=0;
		name="your name is not set"; 				//assigning default values
	}												//it will print this if not initialised
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class _01_gettersSettersConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee01 ob= new Employee01();
		ob.setId(30);			//actual initialization
		ob.setName("Samay Raina");		//actual initialization
		System.out.println("id = "+ob.getId());
		System.out.println("name= "+ob.getName());

	}

}
