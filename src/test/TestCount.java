package test;

import static org.junit.Assert.*;
import org.junit.Test;


public class TestCount {

	@Test
	public void test() {
		JUnitTesting test = new JUnitTesting();
		int out = test.counta("Provaa");
		assertEquals(2, out);
	}

}
