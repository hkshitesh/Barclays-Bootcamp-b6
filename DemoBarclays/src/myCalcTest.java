import static org.junit.Assert.*;

import org.junit.Test;

public class myCalcTest {

	Book bk = new Book();
	long i = bk.check_isbn(1501173219);
	String p = bk.check_publisher("Celadon Books");
	int c = bk.check_cost(23);
	
	@Test
	public void test_isbn() {

	 assertEquals(1501173219, i);	
	}
	@Test
	public void test_pub() {

	assertEquals("Celadon Books", p);			
	}
	@Test
	public void test_cost() {

		assertEquals(23, c);	
	}
}
