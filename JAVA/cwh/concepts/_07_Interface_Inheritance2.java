package _01_PracticeConcept;
interface DishTv7
{	
	void movieChannel();
	void sportChannel();

}

interface Android7 extends DishTv7
{
	void netflix();
	void pubg();
	void instagram();
};
class SmartTv7 implements Android7
{

	@Override
	public void movieChannel() {
		// TODO Auto-generated method stub
		System.out.println("3 Ediots movie is playing");
		
	}

	@Override
	public void sportChannel() {
		// TODO Auto-generated method stub
		System.out.println("india vs nz match is going on");
	}

	@Override
	public void netflix() {
		// TODO Auto-generated method stub
		System.out.println("Stranger things season 3 is streaming");
	}

	@Override
	public void pubg() {
		// TODO Auto-generated method stub
		System.out.println("you can play pubg with ur squad");
	}

	@Override
	public void instagram() {
		// TODO Auto-generated method stub
		System.out.println("you can access instagram");
	}


	
}

public class _07_Interface_Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		SmartTv7 ob= new SmartTv7();
		ob.pubg();
		ob.movieChannel();
		ob.instagram();
	}

}
