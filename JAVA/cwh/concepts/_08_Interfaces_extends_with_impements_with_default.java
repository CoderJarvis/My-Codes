package _01_PracticeConcept;

class Phone7
{
	public void call()
	{
		System.out.println("this phone has calling function");
	}
}

interface Camera7
{	int pixel=65;	//interface properties always final
	void takePhoto();
	void takePanaroma();
	void recordVideo();
	void recordSlowMotiomnVideo();
}

interface Calculator
{
	void addition();
	void subtraction();
	void multiplication();
	void division();
}
interface Internet
{
	void browsing();
	void socialMedia();
	void youtube();
}
interface Gaming
{
	void pubg();
	void valorant();
	void callOfDuty();
	void apexLigend();
	default void fallGuys()
	{
		System.out.println("playing fallgyus"); //this function added later
	}	//without default keyword it will show error//this enables us to add new
}		//functionalities to our exitsing Interfaces

class SmartPhone7 extends Phone7 implements Camera7,Calculator,Internet,Gaming
{


	
	public void takePhoto()
	{
		System.out.println("taking photo");
	}
	
	public void recordVideo()
	{
		System.out.println("recoding video");
	}
	
	public void addition()
	{
		System.out.println("i can add");
	}
	
	public void subtraction()
	{
		System.out.println("i can subtract");
	}

	@Override
	public void pubg() {
		// TODO Auto-generated method stub
		System.out.println("playing pung");
		
	}

	@Override
	public void valorant() {
		// TODO Auto-generated method stub
		System.out.println("playing valorant");
		
	}

	@Override
	public void callOfDuty() {
		// TODO Auto-generated method stub
		System.out.println("playing callofduty");
		
	}

	@Override
	public void apexLigend() {
		// TODO Auto-generated method stub
		System.out.println("playing apexligend");
		
	}

	@Override
	public void browsing() {
		// TODO Auto-generated method stub
		System.out.println("browing stuffs");
		
	}

	@Override
	public void socialMedia() {
		// TODO Auto-generated method stub
		System.out.println("using instagram");
		
	}

	@Override
	public void youtube() {
		// TODO Auto-generated method stub
		System.out.println("watching videos on youtube");
		
	}

	@Override
	public void multiplication() {
		// TODO Auto-generated method stub
		System.out.println("i can multiply");
	}

	@Override
	public void division() {
		// TODO Auto-generated method stub
		System.out.println("i can devide");
	}

	@Override
	public void takePanaroma() {
		// TODO Auto-generated method stub
		System.out.println("taking panaroma picture");
	}

	@Override
	public void recordSlowMotiomnVideo() {
		// TODO Auto-generated method stub
		System.out.println("recording slow motion video");
	}
}

public class _08_Interfaces_extends_with_impements_with_default {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartPhone7 ob=new SmartPhone7();
		ob.addition();
		ob.takePhoto();
		ob.recordVideo();
		ob.pubg();
		ob.callOfDuty();
		ob.call();
		System.out.println();
		
		//dynamic method displatch
		//or polimorphism in inheritance
		
		Camera7 ob1=new SmartPhone7();
		ob1.takePhoto();
	//	ob1.call(); //not allowed //only inteface-'camera' methods can be accesable
		ob1.recordSlowMotiomnVideo();
	//	ob1.pixel=99; //interface properties cant be modified coz it's final
		System.out.println();
	//  ob1.pubg(); //i cant play pubg beacuse i was tell it's camera
		
		Calculator ob2=new SmartPhone7();
		ob2.addition();
		ob2.division();
	//	ob2.socialMedia(); //i can't use social media because i was tell it's calculator
	}

}
