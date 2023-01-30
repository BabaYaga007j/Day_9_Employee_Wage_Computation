package com.bz;

public class ImplWageComputation implements IwageCopmutation
{

	public void calculateMonthlyWage() {
		byte workingDay=20;
		
		if (workingDay == 20) {
			
			int wage = workingDay*160;//assuming 20 working day
			System.out.println("total wage :: " + wage);
	}
	
	}	
}
		
