package teluskoCrash; //break and continue

public class _2Demo {
public static void main(String[] args) {
	System.out.println("this is the second practice java video");
	
	for(int i=1;i<=10;i++)
	{	if(i==5)
		continue; //skip
		System.out.println("the value of i is "+i);
	}
	
	for(int j=1;j<=10;j++)
	{	
		if(j==7)
			break;
		System.out.println("the value of j is "+j);
	}
}
}
