package com_JavaLearning_Basics;

public class BabyDog extends Dog
{
	
	String dob = "25/2/2020";
	int height = 5;
	String colour = "cutedoggy";
	
	public BabyDog()
	{
		super();
		super.height = height;
		super.colour =  colour;
		System.out.println("We are in Sub child class construtor "+super.height + " " +colour);
		
	}
	
	public void eat()
	{
		super.print();
		System.out.println("Animal Age shoule be = "+super.age);
		System.out.println("Animal Name is = "+super.name);
		System.out.println("Animal DOB as = "+dob);
	//	System.out.println("Child Class= "+age1);
	//	System.out.println("Child Class= "+name1 );
		System.out.println("This is baby dog class");
	}

}
