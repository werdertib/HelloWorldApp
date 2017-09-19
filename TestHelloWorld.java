TestHelloWorld.java

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import org.junit.Before;
import org.junit.Test;


public class TestHelloWorld {

@Test
	public void testingHelloWorld() {
		assertEquals("Here is test for Hello World String: ", "Hello + World", HelloWorldApp());
	}
}
