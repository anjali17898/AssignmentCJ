package com.excep.assign;

import java.util.Scanner;

public class TestAgeCalculator1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter DOB (dd/mm/yyyy) : ");
		String dob=sc.next();
		AgeCalculator1.calculateAge(dob);
	}
}
