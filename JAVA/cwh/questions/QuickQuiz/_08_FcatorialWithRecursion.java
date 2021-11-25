package _02_QuickQuiz;

public class _08_FcatorialWithRecursion {
	
	public static int factorial(int x)
	{
		if(x==0 || x==1)
			return 1;
		else
		return x*factorial(x-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		System.out.println(factorial(n));

	}

}
