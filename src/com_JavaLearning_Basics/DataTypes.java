/*
 *  Desc - Variable assignment with different data types and printing their values
 */

package com_JavaLearning_Basics;


public class DataTypes { // start point 

	// Assigning static to a variable 
	static int num1 = 200; // Local Variable  1001 to 1004 - value 
	static int num2 = 100;  //1102 to 1106
	static int num3=0; // instance variable / Global varible  // 1500 to 1504
    static int non; // Gloal varaible 
	
public static void main(String[] args) //method 
{
	
	int non; // local variable 
	int num1; // 1204 - 1208
	int num2; // 1234-1238
	int a = 100000000; // Local variable 
	byte b = 5;
	short s = 5263;
    long d = 1000000000;
	
	boolean flag = true;
	char letter = '8';
	float f = 3.14f;
	double g = 3.565444;
	
	String age = "Ramesh";
	String  age2 = "Vijay";
	int num4;
	String age3 =  age+age2;
	System.out.println("Num3="+num3);
	System.out.println("integer ="+a);
	addtion();
	substract();
	num3=265;
	System.out.println("Static value now "+num3);


	 // calling to your method 
}

// created add method for myself
    public static void addtion ()  //  non static 
    {
    	System.out.println(non);
    	 num3 = num1+num2;
    	System.out.println("Addition = "+num3);
    	
    	
    }
 
    // Static for method 
    public static void substract ()
    {
    	
    	 num3 = num1-num2;
    	System.out.println("Substract = "+num3);
    	
    	
    }
    
    
    
    
}
