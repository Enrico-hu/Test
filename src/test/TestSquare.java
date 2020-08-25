package test;

import static org.junit.Assert.*;
import org.junit.Test;


public class TestSquare {

	@Test
	public void test() {
		JUnitTesting test = new JUnitTesting();
		int out = test.square(5);
		assertEquals(25, out);
	}

}
