import static org.junit.Assert.*;

import org.junit.Test;

// JUnit tests for Tutorial.java class 
// Author: Renata Rand McFadden, PhD
// Version 1

public class TestTutorialCodeCoverage {

	@Test
	// test that default constructor initializes attrInt attribute correctly to -1	
	// uses getAttrInt method to check and indirectly tests it
	// test line #18
	public void testDefaultConstructorAttrInt() {
		Tutorial tut = new Tutorial();   // creates new instance of Tutorial class
		assertEquals(-1, tut.getAttrInt());
	}
	
	@Test
	// test that default constructor initializes attrStr attribute correctly to "none"	
	// uses getAttrStr method to check and indirectly tests it
	// test line #19
	public void testDefaultConstructorAttrStr() {
		Tutorial tut = new Tutorial();   // creates new instance of Tutorial class
		assertEquals("none", tut.getAttrStr());
	}
	
	@Test
	// test that second constructor sets attrInt attribute correctly 
	// test line #39
	public void testSecondConstructorAttrInt() {
		Tutorial tut = new Tutorial(2,"value");   // creates new instance of Tutorial class
		assertEquals(2, tut.getAttrInt());
	}
	
	@Test
	// test that second constructor sets attrStr attribute correctly 	
	// test line #40
	public void testSecondConstructorAttrStr() {
		Tutorial tut = new Tutorial(3, "value");   // creates new instance of Tutorial class
		assertEquals("value", tut.getAttrStr());
	}
	
	@Test
	// test second constructor: exception for invalid num parameter
	// throws exception for negative value 
	// IllegalArgumentException and message "First parameter must be greater than 0 and less than 5"
	// test line #32
	public void testSecondConstructorAttrIntNegative()  {
		try {
			new Tutorial(-1, "value");   // create an instance of class with num negative
			fail("Should have thrown an exception when first parameter is negative");
		} catch (IllegalArgumentException e) {
			assertEquals("First parameter must be greater than 0 and less than 5", e.getLocalizedMessage()); // check message
		} catch (Exception e2) {
			fail("Caught exception but it is not IllegalArgumentException as expected");
		}
	}
	
	@Test
	// test second constructor: exception for invalid str parameter
	// throws exception for null value 
	// IllegalArgumentException and message "Second parameter cannot be null or empty string"
	// test line #36
	public void testSecondConstructorAttrStrNull()  {
		try {
			new Tutorial(3, null);   // create an instance of class with null str
			fail("Should have thrown an exception when second parameter is null");
		} catch (IllegalArgumentException e) {
			assertEquals("Second parameter cannot be null or empty string", e.getLocalizedMessage()); // check message
		} catch (Exception e2) {
			fail("Caught exception but it is not IllegalArgumentException as expected");
		}
	}
	
	@Test
	// test that printLoop prints max number of times 	
	// test line #61, #62, #64
	public void testPrintLoopConcatMax() {
		Tutorial tut = new Tutorial(4, "v");   // creates new instance of Tutorial class
		String result = tut.concatLoop();
		assertEquals("v v v v ", result);
	}

}
