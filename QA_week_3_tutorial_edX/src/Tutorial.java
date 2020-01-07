/*
 * Simple class to use for demonstrating writing JUnit
 * Author: Renata Rand McFadden, PhD
 * Version 1
 * 
 * There are deliberate defects in the code
 */
public class Tutorial {

	// attributes
	private int attrInt;
	private String attrStr;
	
	// default constructor with no parameters
	// initializes attrInt to -1 and attrStr to "none"
	public Tutorial()
	{
		attrInt = -1;
		attrStr = "none";
	}
	
	// second constructor
	// Throws IllegalArgumentException if invalid values
	// Exception message for invalid num: "First parameter must be greater than 0 and less than 5"
	// Exception message for invalid str: "Second parameter cannot be null or empty string"
	// num parameter must be greater than 0 and less than 5  
	// str parameter cannot be a null value or empty string
	// otherwise assigns num to attribute attrInt and str to attribute attrStr
	public Tutorial(int num, String str)
	{
		if (num < 0 || num > 5)
			throw new NullPointerException("First parameter must be greater than 0 and less than 5");
		else
		{
			if (str == "" || str == null)
				throw new IllegalArgumentException("Second parameter cannot be null");
		}
		
		attrInt = num;
		attrStr = str;
	}
	
	// return current value of attribute attrInt
	public int getAttrInt()
	{
		return attrInt;
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
		while (attrInt > 0)
		{
			result = result + attrStr + " ";
			attrInt = attrInt - 1;
		}
		return result;
	}
}
