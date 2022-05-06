package com.bridgelabz.employeewage;

public class DailyWage {
	
	static final int IS_FULL_TIME = 1;
	static final int EMP_RATE_PER_Hr = 20;
	
	public static void main (String[] args) {
		int empHrs = 0;
		int empWage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		
		if(empCheck == IS_FULL_TIME) {
			System.out.println("Employee is Present");
			empHrs = 8;
			empWage = empHrs * EMP_RATE_PER_Hr;
			System.out.println("Employee Wage is : " + empWage);
		}
		else
		{
			System.out.println("Employee is Absent");
			empHrs = 0;
			empWage = empHrs * EMP_RATE_PER_Hr;
			System.out.println("Employee Wage is : " + empWage);
		}
	}
}
