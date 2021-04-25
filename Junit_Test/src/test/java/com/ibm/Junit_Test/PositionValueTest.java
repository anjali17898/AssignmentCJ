package com.ibm.Junit_Test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PositionValueTest {
	private PositionValue positionValu;

	@BeforeEach
	public void beforeEach() {
		positionValu = new PositionValue();
	}

	@Test
	public void testRemoveA_InFirst2Position() {
		String expected = "BCDBCD";
		String actual = positionValu.removeAInFirst2Position("AABCD");
		Assertions.assertEquals(expected, actual);
	}
}
