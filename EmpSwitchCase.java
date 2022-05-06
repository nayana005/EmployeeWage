package com.bridgelabz.employeewage;

import java.util.Scanner;

public class EmpSwitchCase {
	
	public static void main (String[] args) {
		int empWagePerHr = 20;
		int fullDayHr = 8;
		int partTimeHr = 4;
		
		double empCheck = Math.floor(Math.random() * 10) % 2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 0 to 2");
		int number = sc.nextInt();
		switch (number)
		{
		case 1 :
			System.out.println("Employee is Present:");
			int empWage = empWagePerHr * fullDayHr;
			System.out.println("Employee Wage is:" + empWage);
			break;
		case 2 :
			System.out.println("Employee is Present:");
			int empWagePartTime = empWagePerHr * partTimeHr;
			System.out.println("Employee Wage is:" + empWagePartTime);
			break;
		default :
			System.out.println("Employee is Absent:");
			System.out.println("Salary is zero");
		}
	}

}
