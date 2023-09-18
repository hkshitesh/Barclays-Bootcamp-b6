import static org.junit.Assert.*;

import org.junit.Test;

import mypkg.MyCalculator;

public class TestMyCalc {	
	MyCalculator calc= new MyCalculator();

	@Test
	public void test_sum() {		
		assertEquals(20, calc.sum(15, 5));
	}
	
	
	@Test
	public void test_diff() {		
		assertEquals(10, calc.diff(15, 5));
	}
	
	@Test
	public void test_fname() {		
		assertEquals("Hitesh",calc.getFirstName());
	}

}
