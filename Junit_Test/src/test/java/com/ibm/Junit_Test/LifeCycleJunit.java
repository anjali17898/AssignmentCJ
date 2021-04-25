package com.ibm.Junit_Test;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LifeCycleJunit {
	@BeforeAll
	public static void beforeAll() {
		System.out.println("BeforeAll");
		System.out.println(" ");
	}

	@BeforeEach
	public void setup() {
		System.out.println("before every test cases");
	}

	@Test
	public void test1() {
		System.out.println("test 1 executed ");
	}

	@Test
	public void test2() {
		System.out.println("test 2 executed ");
	}
	
	@Test
	public void test3() {
		System.out.println("test 3 executed ");
	}

	@AfterEach
	public void testdown() {
		System.out.println("after each test case ");
		System.out.println(" ");
	}

	@AfterAll
	public static void afterAll() {
		System.out.println("after all ");
	}
}
