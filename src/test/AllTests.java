package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCount.class, TestSquare.class, SumTest.class, TestDivide.class})
public class AllTests {

}
