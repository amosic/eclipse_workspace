/*
 * Simple class to use for demonstrating writing JUnit
 * Author: Renata Rand McFadden, PhD
 * Version 1
 * 
 * There are deliberate defects in the code
 */
public class Tutorial {//first class

	// attributes
	private int attrInt;
	private String attrStr;
	
	// default constructor with no parameters
	// initializes attrInt to -1 and attrStr to "none"
	public Tutorial()//check unit testing the 1st constructor has to have the same name as the class //in 1 test case i can check a single value//every value can be checked with an assert statement and I should have 1 assert statemnt per test
	{
		attrInt = -1; //statement=executable code, this is assignement statement (assigns negative value to attribute Int (attrInt) 
		attrStr = "none";//2 unit testing the 2 assignement statements: 1. check the value of attrInt 2. check the attrStr
	}
	
	// second constructor
	// Throws IllegalArgumentException if invalid values
	// Exception message for invalid num: "First parameter must be greater than 0 and less than 5"
	// Exception message for invalid str: "Second parameter cannot be null or empty string"
	// num parameter must be greater than 0 and less than 5  
	// str parameter cannot be a null value or empty string
	// otherwise assigns num to attribute attrInt and str to attribute attrStr
	public Tutorial(int num, String str)//check unit testing the 2nd constructor
	{
		if (num < 0 || num > 5)//statement= a condition for an if, so an if statement
			throw new NullPointerException("First parameter must be greater than 0 and less than 5");////statement= throw statement
		else  //statement= else statement
		{  //brace lines show that else statement has multiple lines of code
			if (str == "" || str == null) //another if statement inside else statement (nested statements)
				throw new IllegalArgumentException("Second parameter cannot be null"); //another throw statement (nested statements)
		}
		
		attrInt = num;//statement = assignement statement
		attrStr = str; //statement=assignement statement
	}
	
	// return current value of attribute attrInt
	public int getAttrInt()
	{
		return attrInt; //statement = return statement
	}
	
	// return current value of attribute attrStr
	public String getAttrStr()
	{
		return attrStr;
	}
	
	// concatenate the value of attrStr by the value of attrInt with spaces between them 
	// return empty string if attrInt less than or equal to 0
	public String concatLoop()
	{
		String result = "";
		while (attrInt > 0)//statement= while loop statement whithin it we have assignement statements
		{
			result = result + attrStr + " ";
			attrInt = attrInt - 1;
		}
		return result;
	}
}
