package com.bz;

public class ImplWageComputation implements IwageCopmutation
{
	
		public void getDailyEmployeeWage() {
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

	public void addPartTimeEmployeeWage() {

		byte perHour = 20;
		byte fullTime = 8;
		int employee = (int) (((Math.random())* 100 ));
		
		System.out.println("Employee present" + employee);
		
		int wage = perHour*fullTime*employee;
		System.out.println("Total wage perday :: " + wage);

	}

	public void switchCase() {
		byte partTime=(byte)(Math.random()*10);

		int wagePerHour=20;
	
		System.out.println("Part_Time Hour :: "+partTime);
		switch(partTime) {
		case 2:
			System.out.println("Total number of Part_Time working hour :: "+partTime);
			System.out.println("Total Wage_per_Day :: "+wagePerHour*partTime);
			System.out.println("Total Wage_per_Month :: "+wagePerHour*partTime*20);
			break;
		case 3:
			System.out.println("Total number of Part_Time working hour :: "+partTime);
			System.out.println("Total Wage_per_Day :: "+wagePerHour*partTime);
			System.out.println("Total Wage_per_Month :: "+wagePerHour*partTime*20);
			break;
		case 4:
			System.out.println("Total number of Part_Time working hour :: "+partTime);
			System.out.println("Total Wage_per_Day :: "+wagePerHour*partTime);
			System.out.println("Total Wage_per_Month :: "+wagePerHour*partTime*20);
			break;
		case 5:
			System.out.println("Total number of Part_Time working hour :: "+partTime);
			System.out.println("Total Wage_per_Day :: "+wagePerHour*partTime);
			System.out.println("Total Wage_per_Month :: "+wagePerHour*partTime*20);
			break;
		case 6:
			System.out.println("Total number of Part_Time working hour :: "+partTime);
			System.out.println("Total Wage_per_Day :: "+wagePerHour*partTime);
			System.out.println("Total Wage_per_Month :: "+wagePerHour*partTime*20);
			break;
		case 7:
			System.out.println("Total number of Part_Time working hour :: "+partTime);
			System.out.println("Total Wage_per_Day :: "+wagePerHour*partTime);
			System.out.println("Total Wage_per_Month :: "+wagePerHour*partTime*20);
			break;
		case 8:
			System.out.println("Total number of Part_Time working hour :: "+partTime);
			System.out.println("Total Wage_per_Day :: "+wagePerHour*partTime);
			System.out.println("Total Wage_per_Month :: "+wagePerHour*partTime*20);
			break;
		default:
			System.out.println(" :: Invalid Working Hour ::");	
		}
	}

	public void calculateMonthlyWage() {
		byte workingDay=20;
		
		if (workingDay == 20) {
			
			int wage = workingDay*160;//assuming 20 working day
			System.out.println("total wage :: " + wage);
	}
	}

	
}
		
