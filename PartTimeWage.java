package com.bridgelabz.employeewage;

public class PartTimeWage {
	
	static final int IS_PART_TIME = 1;
	static final int IS_FULL_TIME = 2;
	static final int EMP_RATE_PER_Hr = 20;
	
	public static void main (String[] args) {
		int empHrs = 0;
		int empWage = 0;
		
		double empCheck = Math.floor(Math.random() * 10) % 3;
		
		if(empCheck == IS_FULL_TIME) {
			System.out.println("Employee is Present");
			empHrs = 8;
			int empWage1 = empHrs * EMP_RATE_PER_Hr;
			System.out.println("Employee Full Time Wage is : " + empWage1);
		}
		else if(empCheck == IS_PART_TIME){		
			System.out.println("Employee is Present");
			empHrs = 4;
			int empWagePartTime = empHrs * EMP_RATE_PER_Hr;
			System.out.println("Employee Part Time Wage is : " + empWagePartTime);
		}
		else
		{
			empHrs = 0;
			empWage = empHrs * EMP_RATE_PER_Hr;
			System.out.println("Employee is Absent");
			System.out.println("Employee Wage is : " + empWage);
		}
	}
}


