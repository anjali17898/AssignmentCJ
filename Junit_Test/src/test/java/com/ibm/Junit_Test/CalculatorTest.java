package com.ibm.Junit_Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
private Calculator calcTest;

@BeforeEach
public void setup() {
	calcTest=new Calculator();
}
@Test
public void testAdd() {
	int a=35;
	int b=20;
	
	int expectedResult=55;
	long result=calcTest.add(a, b);
	Assertions.assertEquals(expectedResult, result);
}

public void testSubtract() {
	int a=12;
	int b=20;
	
	int expectedResult=8;
	long result=calcTest.add(a, b);
	Assertions.assertEquals(expectedResult, result);
}
}
