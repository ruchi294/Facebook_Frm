package com_JavaLearning_Basics;

abstract public class Bank
{
	
	final int ROI = 10;
	Bank()
	{
	  
		System.out.println("We are in Bank Construtor ");
	}
	 abstract  void  rateOfInterest();
	
	// This fixed implemetation 
	final public  void rules()
	{
		System.out.println("Bank should be registersted ");
		System.out.println("Bank should have 100 customers ");
	}
	
	

}
