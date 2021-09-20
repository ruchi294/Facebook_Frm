package com_JavaLearning_Basics;

public class SwitchCondtitonalStmt
{
	String weekday = "Tuesday";
	
	char week = 'M';
	public void switchExample()
	{
		
		switch(week)
		{
		   case 'M': 
		   {
			   System.out.println("We are in Case M");
			     switch(weekday)
			     {
			       case "Monday": 
			        System.out.println("Monday");
			        break;
			        
			        default: 
			         System.out.println("No other day required");	
			        
			     }
			   
		   }
		   break;
			   
		   case 'T':
			   	System.out.println("Tuesday");
			   	
			   	break;
			   
		   case 'W':
			   	System.out.println("Wednesday");
			   
			   	break;
			   
			default :
				System.out.println("not in above 3");
		}
		
		
	}

}
