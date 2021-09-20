package com_JavaLearning_Basics;

public class MethodOverloading extends ExceptionHandling
{
	int c;
	double k;
	public void Add(int a , int b)
	{
		c = a+b;
		System.out.println(c);
		
	}
	
	public void Add(int a , int b,int d)
	{
		c = a+b+d;
		System.out.println(c);
	}
	
	public void Add(double a , double b)
	{
		k = a+b;
		System.out.println(k);
	}
}
