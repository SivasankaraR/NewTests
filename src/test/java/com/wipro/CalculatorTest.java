package com.wipro;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		assertEquals(5,new Calculator().add(2,3));
		System.out.println("add");
	}

	@Test
	public void testSub() {
		assertEquals(2, new Calculator().sub(5,3));
		System.out.println("sub");
	}

}
