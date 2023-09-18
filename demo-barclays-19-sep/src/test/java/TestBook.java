import static org.junit.Assert.*;

import org.junit.Test;

import mypkg.Book;

public class TestBook {
	
	Book bk = new Book();

	@Test
	public void test() {
		
		assertEquals("All the Light We Cannot See", bk.getTitle());
		
	}

}
