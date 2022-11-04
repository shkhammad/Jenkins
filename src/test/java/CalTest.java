import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalTest {
	
	
	Calculator cal = new Calculator();
	
	@Test
	public void addTest() {
		assertEquals(4, cal.add(2, 2));
	}
	
	
	@Test
	public void subTest() {
		assertEquals(5, cal.sub(10, 5));
	}
	
}
