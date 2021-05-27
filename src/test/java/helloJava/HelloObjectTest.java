package helloJava;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HelloObjectTest {

	@Test
	public void testLength() {
		HelloObject helloObj = new HelloObject();
		assertEquals(7, helloObj.printHello().length());
	}
	
}
