package com.bz;

public class ImplWageComputation implements IwageCopmutation
{

	
	
	public void getDailyEmployeeWage()
	{
		byte perHour = 20;
		
		int perDayTime = (int) (((Math.random())* 10 ));
		
		System.out.println("Working Hours :: "+perDayTime);
		
		if (perDayTime % 8 == 0 && perDayTime != 0) {
			
			int wage = (int) (perDayTime*perHour);
			
			System.out.println("Full day slary is :: " + wage);
		}
		else if (perDayTime % 4 == 0 && perDayTime != 0) {
			
			int wage = (int) (perDayTime*(perHour/2));
			
			System.out.println("Half day salary is :: " + wage);
		}
		else {
			System.err.println("invalid working hours");
		}
	}
	}
		
