package com_JavaLearning_Basics; // package name is showing in which package you are now 



public class Demo // To start something in Java you need class 
{
	
	int num1 = 400;
	int num2 = 100;
	int num3;

	 public static void main(String[] args) // To execute something in Java Main method 
    {
  	 
		 // here i will use my displayMessage method which in ObjectCreation class 
		 // to access this method from that class we need to call that method 
		 System.out.println(" lin 1");
		// System.out.println(" lin 2");
		 System.out.println(" lin 3");
		 ObjectCreation abc =new ObjectCreation();  // syntax for creating object of any class 
		 abc.substract();
		 
		// System.out.println("public varaible  ="+abc.num1);
		 //System.out.println("private  varaible  ="+abc.num3);
		 ObjectCreation.staticDemo();
		 
		 result(); // call to a method 
		 
		Demo de = new Demo();
		de.add();
		de.subs();
		de.multi();
		 
    }

	 // Method defination
	 public static void result()
	 {
		 System.out.println("In Demo Class = Result is static method ");
	 }
	 
	 public  boolean multi()
		{
		    boolean  num3=true;
			//num3 = num1*num2;
			//System.out.println("Multi is = "+num3);
			return num3;
		}
		
			// I dont main method here , structure , mehtods 
			public void add()
			{
				num3 = num1+num2;
				System.out.println("Addition is = "+num3);
			}
			
			public void subs()
			{
				num3 = num1-num2;
				System.out.println("Substraction is = "+num3);
				
			}
			
			
			
			
			
}



