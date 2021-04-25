package com.lms.assignment5;

import java.util.LinkedHashSet;

public class TestPatientList {

	public static void main(String[] args) {
		// create array list object
		LinkedHashSet<Patient> patientList = new LinkedHashSet<>();
		// add 3 patient
		patientList.add(new Patient(101, "Rajkumar", 88));
		patientList.add(new Patient(101, "Vishwajeet", 48));
		patientList.add(new Patient(101, "Sivaditya", 35));
		patientList.add(new Patient(101, "Sivaditya", 35));

		// display the size of set
		System.out.println("Size of Set :" + patientList.size());
		// patient details
		System.out.println(patientList);

	}
}
