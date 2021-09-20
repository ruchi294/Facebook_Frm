package com_JavaLearning_Basics;

public class ArrayExample
{
	
	
	String s  = "ABC";

	// array declare
	// Single dimesion array 
	
	
	int no[] = {2,5,6,8,10,20};
	
	public void arrayExample(String name[])
	{
		
		System.out.println("Name ="+name[2]);
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
		int min =  no [0];
		for(int j =0;j<no.length;j++)
		{
			if(min<no[j])
				;
		}
		System.out.println(min);
	}
	
	
	// Multidimension Array 
	
	public void multiDimen()
	{
		int arr[][] = {{10,20},{30,40} };
		
		for(int i =0;i<arr.length;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
		
	}
	

	public void addArray()
	{
		
		
		int a[][] = {{1,3,5},{3,5,8}};
		int b[][] = {{1,3,4},{3,4,5}};
		
		int c[][] = new int [2][3];
		
		
				for(int i =0;i<2;i++)
				{
					for(int j=0;j<3;j++)
					{
							c[i][j]= a[i][j]+b[i][j];
		
							 System.out.print(c[i][j]+" ");
					}
					System.out.println();
				}
		
		
		
				
	
	}
	
	
	
	
	
	

}
