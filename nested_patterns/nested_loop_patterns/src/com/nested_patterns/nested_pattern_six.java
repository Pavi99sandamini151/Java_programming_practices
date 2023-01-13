package com.nested_patterns;

public class nested_pattern_six {
	public static void main(String[] args) 
	{
	 System.out.println("Displaying pattern of numbers: ");	
	// Outer for loop.
	  for(int i = 5; i >= 1; i--)
	  {
	 // Inner for loop.
	   for(int j = 1; j <= i; j++) {
	     System.out.print(j+ " ");
	    }
	   System.out.println(" ");
	  }
	 }
}
