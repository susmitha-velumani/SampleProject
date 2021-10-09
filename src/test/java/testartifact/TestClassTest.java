package testartifact;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class TestClassTest {
	
	@Test	
    public void testDemo() {
		
		TestClass test=new TestClass();		
        assertEquals(10, test.demo(5, 5));
    }

}
