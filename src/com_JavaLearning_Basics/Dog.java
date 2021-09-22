package com_JavaLearning_Basics;

public class Dog extends Animal
{
     String name = "Jumbo";
     String colour;
     
     public Dog()
     {
    	 System.out.println("We are in Child- Dog class construtor ");
     }
     public void demo()
	{
		super.print(); // Availbe in Animal Calss 
		System.out.println("We are in Child Class ");
	}
	
    
}
