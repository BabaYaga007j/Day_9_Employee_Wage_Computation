package com.bz;

public class EmployeeWageMain {
	
	public static void main(String[] args) {
		
		IwageCopmutation computation= new ImplWageComputation();
		computation.wageForReliance("Reliance",20,30,4);
		computation.wageForTata("Tata",20,48,45);
		computation.wageForTcs("Tcs",40,40,40);
		computation.wageForBirla("Birla",40,50,20);
		
	}

}
