package com.bz;

public class ImplWageComputation implements IwageCopmutation
{
	public void displayMessage()
	{
		System.out.println("Welcome to Employee Wage Program");
	}

	public void checkEmployeePresentOrAbsent() {
		
		int emp = 1;
		int empCheck = (int) ( (Math.random() * 10 )% 2);
		if (empCheck == emp) {

			System.out.println("Employee is present");
			
		} else {
			
			System.out.println("Employee is absent");

		}
	}
		
}
