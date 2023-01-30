package com.bz;

public class ImplWageComputation implements IwageCopmutation
{

	
	public void addPartTimeEmployeeWage() {
		
			byte perHour = 20;
			byte fullTime = 8;
			int employee = (int) (((Math.random())* 100 ));
			
			System.out.println("Employee present" + employee);
			
			int wage = perHour*fullTime*employee;
			System.out.println("Total wage perday :: " + wage);

		}
	}

		
