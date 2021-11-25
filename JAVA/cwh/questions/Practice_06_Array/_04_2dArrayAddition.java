package com.Practice_06_Array;

public class _04_2dArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][]= { {6,8,9},
						{4,6,9} };
		int arr2[][]= { {3,5,7},
					    {2,9,4} };
		
		int arr3[][]={ {0,0,0},
				        {0,0,0} };
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				arr3[i][j]=arr1[i][j]+arr2[i][j];
				
			}
		}
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;i<arr2.length;j++)
			{
			System.out.println(arr3[i][j]+" ");
				
			}
			System.out.println();
			
			
		}

		}
		

	}


