package test;

import static org.junit.Assert.*;
import org.junit.Test;


public class SumTest {

	@Test
	public void test() {
		JUnitTesting test = new JUnitTesting();
		int out = test.sum(3, 5);
		assertEquals(8, out);
	}

}
