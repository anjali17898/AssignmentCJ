package com.mem.test;
import java.util.Date;
import java.util.Scanner;

public class Member {
private long id;
private String firstName;
private String lastName;
private String email;
private String contactNo;
private String licenseNo;
private Date startDate;
private Date expiryDate;

Member(){
}


public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public  String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getContactNo() {
	return contactNo;
}
public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}
public String getLicenseNo() {
	return licenseNo;
}
public void setLicenseNo(String licenseNo) {
	this.licenseNo = licenseNo;
}
public Date getStartDate() {
	return startDate;
}
public void setStartDate(Date startDate) {
	this.startDate = startDate;
}
public Date getExpiryDate() {
	return expiryDate;
}
public void setExpiryDate(Date expiryDate) {
	this.expiryDate = expiryDate;
}

public Member(long id, String firstName, String lastName, String email, String contactNo, String licenseNo,
		Date startDate, Date expiryDate) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.contactNo = contactNo;
	this.licenseNo = licenseNo;
	this.startDate = startDate;
	this.expiryDate = expiryDate;
}
public static void main(String[] args) {
	Member mem1=new Member();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the details of the first person ");
	System.out.println("enter id: ");
	mem1.setId(sc.nextLong());
	sc.nextLine();
	System.out.println("enter the first name: ");
	mem1.setFirstName(sc.nextLine());
	System.out.println("enter last name: ");
	mem1.setLastName(sc.nextLine());
	System.out.println("enter email id: ");
	mem1.setEmail(sc.nextLine());
	System.out.println("enter contact no.: ");
	mem1.setContactNo(sc.nextLine());
	System.out.println("enter the license no: ");
	mem1.setLicenseNo(sc.nextLine());
	
	Member mem2=new Member();
	Scanner sc2=new Scanner(System.in);
	System.out.println("enter the details of the second person ");
	System.out.println("enter id: ");
	mem2.setId(sc.nextLong());
	sc.nextLine();
	System.out.println("enter the first name: ");
	mem2.setFirstName(sc.nextLine());
	System.out.println("enter last name: ");
	mem2.setLastName(sc.nextLine());
	System.out.println("enter email id: ");
	mem2.setEmail(sc.nextLine());
	System.out.println("enter contact no.: ");
	mem2.setContactNo(sc.nextLine());
	System.out.println("enter the license no: ");
	mem2.setLicenseNo(sc.nextLine());
	
	mem1.Display();
	mem2.Display();
}
	public void Display() {
		Member mem1=new Member();
		Member mem2=new Member();
		 System.out.println("Members : "+mem1.getFirstName()+mem1.getLastName());
		 System.out.println("Member contact details : "+mem1.getContactNo()+mem1.getEmail());
		 
		 System.out.println("Member : "+mem2.getFirstName()+mem2.getLastName());
		 System.out.println("Member contact details : "+mem2.getContactNo()+mem2.getEmail());
	}
	public static void Compare() {
		Member mem1=new Member();
		Member mem2=new Member();
	
if(mem1.contactNo==mem2.contactNo && mem1.email==mem2.email) {
	System.out.println("Member 1 and Member 2 are different");

	
}
else {
	System.out.println("Member 1 and Member 2 are not different");
}
	
}


}
