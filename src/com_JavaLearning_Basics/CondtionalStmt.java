package com_JavaLearning_Basics;

public class CondtionalStmt
{

	int a = 21 ;
	
	// Sum digit = 2,4,6,8
	public void validateA()
	{
		if(a%2==0 &&  a%4==0) // 50 > 10
		{
			System.out.println("Yes !! it is sum digit ");
		}
		if(a%3==0)
		{
			System.out.println("No is odd no ");
		}
		else 
		{
			System.out.println("Value is not matching ");
		    System.out.println("Second stmt ");
		}
	
		
		
	}
	
	
	public void UnaryOperator()
	{
		
		// variable ++ , -- =>  first will give you the value then will perform your operation
		int x = 10;
		
		System.out.println("Increment = "+ x--); // 10 (11)
		System.out.println("New value ="+x); // 11
	}
	
	
	public void LogicalOperatior()
	{
		// && (both should TRUE)  || (either of the condition true )
		
		int a = 10;
		int b = 5;
		int c  = 20;
		
		System.out.println(a<b && a<c); // 10<5 && 10<20
		System.out.println(a<b || a<c);  
		
		
	}
	
	
	public void ternaryOperator()
	{
		// ? val 1: val 2
		int a=3;
		int b= 5;
		
		int min = (a<b)?a:b; // 3 < 5
		System.out.println(min);
		
		
		
		
		
		
	}
	
	
	
	
}
