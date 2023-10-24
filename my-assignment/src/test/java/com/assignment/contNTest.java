package com.assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class contNTest {

	@Test
	public void test() {
		Maven_Assignment test = new Maven_Assignment();
		int output = test.countN("Banana");
		assertEquals(2, output);
	}

}
