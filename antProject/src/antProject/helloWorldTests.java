package antProject;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class helloWorldTests {

	@Test
	public void test1()
	{
		int x = 3 , y = 6;
		assertTrue(x+y == 9);
	}
	
}
