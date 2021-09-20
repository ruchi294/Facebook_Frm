package com_JavaLearning_Basics;

public class LoopingStmts
{
  
	int no =1 ;
	
	
	public void for_loopingExample()
	{
		
		// print nos from 1 to 10
		
		// For with IF 
		for(;no<=20;no++)
		{
			if(no %2 ==0)
			System.out.println(no);
			else
			System.out.println(" OOD"+no);
		}
		
		// intialize variable  no = 2
		// condtion  1 <= 10 T
		// execute your code
		// incre value  = 2
	
	}
	
	
	public void NestedFor()
	{
		for(int i = 1;i<=3;i++)
		{
			System.out.println("i=="+i);
			for(int j=1;j<=3;j++)
			{
				System.out.println(" J = "+j);
			}
		}
	}
	
	
	/*   *
	 *   *  *
	 *   *  *  *
	 *   *  *  *  *
	 *   *  *  *  *  *
	 * 
	 */
	
	
	
	/*    * * * * * 
	 *    * * * * 
	 *    * * * 
	 *    * *
	 *     *
	 * 
	 * 
	 */
	
	public void pattern()
	{
		for(int i =1;i<=5;i++)
		{
			for(int j = 1;j<=i;j++) 
			{
				System.out.print("*");
				//ln = next line 
				

			}
			
			System.out.println();
		}
	}
	
	
	/*
	 *  While Loop 
	 * 
	 */
	
	public void whileExpmple()
	{
		// for( ;i<= 10;i++)
		      // syso (i)

		 int i = 1;
		 
		 while(i<=10)
		 {
			 System.out.println(i);
			 i++;
		 }
	}
	
	
	/*
	 * 
	 * Do .. while Loop
	 */
	public void dowhileExample()
	{
		int i = 1;
		
		do {
			System.out.println(i);
			i++;
			
		}while(i<=10);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
