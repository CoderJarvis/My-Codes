package JavaTelusko;

public class _12_2DArray {
public static void main(String[] args) {
	int arr[][]= {
			{11,22,33,44,55,9,86,55},
			{33,44,55,66,77},
			{44,55,66,77}
	};
	
	for(int a[]:arr)
	{
		for(int k:a)
		{
			System.out.print(k+" ");
		}
		System.out.println();
	}
}
}
