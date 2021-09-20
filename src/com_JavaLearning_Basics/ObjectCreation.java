package com_JavaLearning_Basics;

public class ObjectCreation 
{
	private  int num1 = 200; // global - alive 
	private int num2 = 100;
	private int num3 = 0;
	// I dont main method here , structure , mehtods 
	public  void addition()
	{
		 int msg = 0000;
		num3 = num1+num2;
		System.out.println("Addition is = "+num3);
	}
	
	public void substract()
	{
		num3 = num1-num2;
		System.out.println("Substraction is = "+num3);
		
	}
	
	private void multi()
	{
		num3 = num1*num2;
		System.out.println("Multi is = "+num3);
		
	}
	
	public static void staticDemo()
	{
		System.out.println("We are in Static method ");
	}

}
