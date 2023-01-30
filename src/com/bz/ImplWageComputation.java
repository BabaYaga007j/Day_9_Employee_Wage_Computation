package com.bz;

public class ImplWageComputation implements IwageCopmutation
{

	
	private void calculateWage(String company, int wagePerHour, int dayPerMonth, int workHourPerMonth)
	{
		final int FullTIME = 1;
	    final int PartTime = 2;

	        int empHrs;
	        int totalHours = 0;
	        int dailyWage;
	        int day = 0;
	        int totalWage = 0;

	        while ((totalHours < workHourPerMonth) && (day < dayPerMonth)) {
	            int attendance = (int) (Math.floor(Math.random() * 10)) % 3;

	            switch (attendance) {
	                case FullTIME:
	                    empHrs = 8;
	                    break;
	                case PartTime:
	                    empHrs = 4;
	                    break;
	                default:
	                    empHrs = 0;
	                    break;
	            }
	            totalHours = totalHours + empHrs;
	            dailyWage = wagePerHour * empHrs;
	            totalWage = totalWage + dailyWage;
	            day++;
	            System.out.println("Day " + day + " Emp work hour " + empHrs + " wage is " + dailyWage);
	        }
	        System.out.println("Total work hours is: " + totalHours);
	        System.out.println("Total work days are: " + day);
	        System.out.println("Total wage of company " + company + " is " + totalWage);
	}

	public void wageForReliance(String string, int j, int k, int l) {
		
		System.err.println("**********Reliance**********");
		ImplWageComputation computation = new ImplWageComputation();
		computation.calculateWage(string, j, l, k);
		
	}

	public void wageForTata(String string, int j, int k, int l) {
		System.err.println("**********TATA**********");
		ImplWageComputation computation = new ImplWageComputation();
		computation.calculateWage(string, j, l, k);
	}

	public void wageForBirla(String string, int j, int k, int l) {
		System.err.println("**********BIRLA**********");
		ImplWageComputation computation = new ImplWageComputation();
		computation.calculateWage(string, j, l, k);
	}

	public void wageForTcs(String string, int j, int k, int l) {
		System.err.println("**********TCS**********");
		ImplWageComputation computation = new ImplWageComputation();
		computation.calculateWage(string, j, l, k);
	}

		
	}
	
		
