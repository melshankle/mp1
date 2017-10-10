import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static java.lang.System.out;

import org.junit.Test;

public class MyStackTest {


	@Test 
	public void testPush()
	   {
		MyStack<String> stack = new MyStack<String>();
	      stack.push ("hello");
	      stack.push ("world");
	      assertEquals (stack.peek(), "world");
	   }

	// test 1
	@Test
	public void testStackSize()
	    {
		out.println("Entering testStackSize()");
		MyStack<String> stack = new MyStack<String>();
		stack.push ("CS498");
		stack.push ("CS499");
		assertEquals (stack.size(), 2);
                out.println("Exiting testStackSize()");
	    }

	// test 2
	@Test
	public void testPop()
	    {
                out.println("Entering testPop()");
		MyStack<String> stack = new MyStack<String>();
		stack.push ("element");
		stack.pop ();
		assertEquals (stack.size(), 0);
                out.println("Exiting testPop()");
	    }

	// test 3
	@Test
	public void testConstructor()
	    {
                out.println("Entering testConstructor()");
		MyStack<String> stack = new MyStack<String>();
		assertEquals (stack.empty(), true);
                out.println("Exiting testConstructor()");
	    }

	// test 4
	@Test 
	public void testEmptyList()
	    {
                out.println("Entering testEmptyList()");
		MyStack<String> stack = new MyStack<String>();
		stack.push("Hello");
		stack.pop();
		assertEquals (stack.empty(), true);
                out.println("Exiting testEmptyList()");
	    }

	// test 5
	@Test
	public void testEmptyingStack()
	    {
                out.println("Entering testEmptyingStack()");
		MyStack<String> stack = new MyStack<String>();
		stack.push("Hello");
		stack.clear();
		assertEquals (stack.empty(), true);
                out.println("Exiting testEmptyingStack()");
	    }

	// test 6
	@Test
	public void testPeeking()
	    {
                out.println("Entering testPeeking()");
		MyStack<String> stack = new MyStack<String>();
		stack.push ("Peek-a-boo");
		assertEquals (stack.peek(), "Peek-a-boo");
                out.println("Exiting testPeeking()");
	    }

	// test 7
	@Test
	public void testPeekingWhenEmpty()
	    {
                out.println("Entering testPeekingWhenEmpty()");
		MyStack<String> stack = new MyStack<String>();
		assertEquals (stack.peek(), null);
                out.println("Exiting testPeekingWhenEmpty()");
	    }

	// test 8
	@Test
	public void testEmptyStackSize()
	    {
                out.println("Entering testEmptyStackSize()");
		MyStack<String> stack = new MyStack<String>();
		assertEquals (stack.size(), 0);
                out.println("Exiting testEmptyStackSize()");
	    }

	// test 9
	@Test
	public void testToString()
	    {
                out.println("Entering testToString()");
		MyStack<String> stack = new MyStack<String>();
		stack.push("Hello");
		String testString = stack.toString();
		assertEquals(testString, "[Hello]");
                out.println("Exiting testToString()");
	    }

	// test 10
	@Test
	public void testEmptyPop()
	    {
                out.println("Entering testEmptyPop()");
		MyStack<String> stack = new MyStack<String>();
		if ( stack.empty() == false )
			stack.pop();
		assertEquals (stack.empty(), true);
                out.println("Exiting testEmptyPop()");
	    }

	@Test
	public void failingTest() {
    		assertTrue(false);
	}

}
