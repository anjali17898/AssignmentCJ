package com.excep.assign2;

public class InvalidDOBException extends Exception{
	public String getMessage() {
		return "Date Of Birth can not be after current Date";
	}
}
