package com_JavaLearning_Basics;

public class Democonstrutor
{

	   int rollno ;
		int age ;
		
		// Default 
		public Democonstrutor() 
		{
			System.out.println("We are in constructor ");
		}
		
		
		// paramterzied 
		public Democonstrutor(int roll , int ag)
		{
			this.rollno =roll;
			this.age = ag;
		}
	
	
	public void paraExample(int x , int y)
	{
	   this. rollno = x;
	   this.age = y;
		
	System.out.println("Roll No="+rollno + "Age="+age);
		
	}
	
	
	public void paraExample1()
	{
		System.out.println("Roll No="+rollno + "Age="+age);
		
	}
	
	
}



