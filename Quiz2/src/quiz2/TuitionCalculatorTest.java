package quiz2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TuitionCalculatorTest {

	@Before
	public void setUp() throws Exception {
		TuitionCalculator test = new TuitionCalculator(12000, 4, 2, 19);
	}


	@Test
	public void test() {
		// Initialize some conditions using the constructor designed for testing
		TuitionCalculator test = new TuitionCalculator(12000, .04, .02, 5);
		TuitionCalculator test2 = new TuitionCalculator(50000, .02, .01, 12);
		TuitionCalculator test3 = new TuitionCalculator(27000, .07, .02, 3);
		TuitionCalculator test4 = new TuitionCalculator(12000, .09, .1, 8);
		
		// Check if the values are as expected
		assertEquals("checking test1", test.MonthlyPayment(), 246.83, .1);
		assertEquals("checking test2", test2.MonthlyPayment(), 339.32, .1);
		assertEquals("checking test3", test3.MonthlyPayment(), 1023.24, .1);
		assertEquals("checking test4", test4.MonthlyPayment(), 260.99, .1);
		fail("Not yet implemented");
	}

}
