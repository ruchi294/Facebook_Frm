package com_JavaLearning_Basics;

public class ExceptionHandling 
{
	
	int a = 10;
	
	public void  exceptionExample()
	{
		
		System.out.println("Beginnig");
		try {
			
			String c = null;
			System.out.println(c.length());
		}
		
		
		catch(NullPointerException e)
		{
			System.out.println("Wrong string");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Method 1 exception ");
		}
		catch(Exception e)
		{
			System.out.println("Parent class");
		}
		
		
		finally 
		{
			int a= 10;
			System.out.println("These lines must be executed "+a);
			
		}
	}
	
	
	
	public void exDemo() throws Exception
	{
		int k = 2;

				int c = 10/k;
				System.out.println(c);
			
	}
	
	
}
