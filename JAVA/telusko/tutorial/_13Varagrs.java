package JavaTelusko;
class Demo13
{
	public void show(int ... a) //a receives multile vals ,so 'a' is an array
	{
		for(int k : a)
		{
			System.out.println(k+" ");
		}
	}
	
	public void show(int o) 	//first priority is given to this if there uis only one int argumebnt
	{
		System.out.println("first priority");
	}
	
	
}

public class _13Varagrs {
public static void main(String[] args) {
	
	Demo13 ob=new Demo13();
	ob.show((int)6.5,(int)7.4,7,9,58,64,789);
//	ob.show(6,7,8,9,10);	
	
	
}
}
