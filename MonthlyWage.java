package com.bridgelabz.employeewage;

import java.util.Scanner;

public class MonthlyWage {
	static final int IS_PART_TIME = 1;
	static final int IS_FULL_TIME = 2;
	static final int EMP_RATE_PER_Hr = 20;
	
	public static void main (String[] args) {
		int fullDayHr = 8;
		int partTimeHr = 4;
		int maxWorkingDays = 20;
		
		double empCheck = Math.floor(Math.random() * 10) % 2;
		
		if(empCheck == IS_FULL_TIME) {
			System.out.println("Employee is Present:");
			int empWage = EMP_RATE_PER_Hr * fullDayHr;
			System.out.println("Employee Wage is:" + empWage);
		}
		else if(empCheck == IS_PART_TIME) {
			System.out.println("Employee is Present:");
			int empWagePartTime = EMP_RATE_PER_Hr * partTimeHr;
			System.out.println("Employee Wage is:" + empWagePartTime);
		}
		else
		{
			System.out.println("Employee is Absent");
			System.out.println("Salary is Zero");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 0 to 2");
		int number = sc.nextInt();
		switch (number)
		{
		case 1 :
			System.out.println("Employee is Present:");
			int empWage = EMP_RATE_PER_Hr * fullDayHr;
			System.out.println("Employee Wage is:" + empWage);
			break;
		case 2 :
			System.out.println("Employee is Present:");
			int empWagePartTime = EMP_RATE_PER_Hr * partTimeHr;
			System.out.println("Employee Wage is:" + empWagePartTime);
			break;
		default :
			System.out.println("Employee is Absent:");
			System.out.println("Salary is zero");
		}
		for (int i=0; i <= 20; i++) {
			int dailyWage = EMP_RATE_PER_Hr * fullDayHr * maxWorkingDays * i;
			System.out.println("Employee MonthlyWage is :" +i + " Day is :" + dailyWage);
		}
	}
}
