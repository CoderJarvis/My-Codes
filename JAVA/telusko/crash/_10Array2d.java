package teluskoCrash;

public class _10Array2d {
	public static void main(String[] args) {

//	int a[]= {1,2,3,4};
//	int b[]= {5,6,7,8};
//	int c[]= {9,10,11,12};

		int d[][] = { { 1, 2, 3, 4, 55, 6 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12, 13, 14, 15 },

		};

		for (int i = 0; i <= 2; i++) // i=for rows and j= for columns
		{
			for (int j = 0; j <= 3; j++) {
				System.out.print(" " + d[i][j]);
			}

			System.out.println();
		}
		for (int i = 0; i < d.length; i++) // i=for rows and j= for columns
		{
			for (int j = 0; j < d[i].length; j++) {
				System.out.print(" " + d[i][j]);
			}

			System.out.println();
		}
		int a[]= {1,2,3,4};
		for(int k:a)
		{
			System.out.println(k); //for each rule or advance for loop
		}
		
		for(int k[]:d)
		{
		for(int l:k)
		{
			System.out.print(" "+l); 
		}
		System.out.println();
		}

	}
}  
