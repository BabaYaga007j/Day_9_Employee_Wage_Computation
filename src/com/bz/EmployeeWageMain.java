package com.bz;

public class EmployeeWageMain {
	
	public static void main(String[] args) {
		
		IwageCopmutation computation= new ImplWageComputation();
		computation.getDailyEmployeeWage();
		computation.addPartTimeEmployeeWage();
		computation.switchCase();
		computation.calculateMonthlyWage();
		
	}

}
