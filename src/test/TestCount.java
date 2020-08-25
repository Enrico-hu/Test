package test;

import static org.junit.Assert.*;
import org.junit.Test;


public class TestCount {

	@Test
	public void test() {
		JUnitTesting test = new JUnitTesting();
		int out = test.counta("Bird bird bird, the bird is a word! aaaaaa");
		assertEquals(6, out);
	}

}
