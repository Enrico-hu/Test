package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDivide {

	@Test
	public void test() {
		JUnitTesting test = new JUnitTesting();
		String out = test.divide(25, 5);
		assertEquals("5", out);
	}


}
