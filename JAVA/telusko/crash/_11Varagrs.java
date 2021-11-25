package teluskoCrash;
class A11
{
	public int add(int ... n) //n is a array which accepts all those values that has been passed through the object agr
	{
		int sum=0;
		for(int k:n)
		{
			
			sum=sum+k;
			
			
		}
		return sum;
		
	}
}

public class _11Varagrs {
public static void main(String[] args) {
	A11 ob=new A11();
	System.out.println(ob.add(10,20,30,40,50)); //you can give any no of agruments and it will work
}	
	

}
