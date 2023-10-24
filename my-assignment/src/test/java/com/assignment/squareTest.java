package com.assignment;
import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	@Test
	public void test1() {
		Maven_Assignment test = new Maven_Assignment();
		int output = ((Maven_Assignment) test).square(4);
		assertEquals(16, output);
	}

	private void assertEquals(int i, int output) {
		// TODO Auto-generated method stub
		
	}

}
