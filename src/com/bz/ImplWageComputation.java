package com.bz;

public class ImplWageComputation implements IwageCopmutation
{

	public void calculateWage() {
		byte day = 0;
		
		for(int i=1; i<=100; i++) {
			
			i=i+1;
			if (i%8==0) {
				
				day=(byte) (day+1);
				
			}
			
		}
		System.out.println(day<20 ? "Number of hours reached first" : "Number of days reached first");

	}

	
		
}
		
