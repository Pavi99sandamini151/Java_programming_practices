package com.nested_patterns;

public class nested_pattern_eight {
	public static void main(String[] args) 
	{
	 System.out.println("Displaying alphabet pattern: ");	
	// Outer for loop.
	  for(int i = 69; i >= 65; i--)
	  {
	 // Inner for loop.
	   for(int j = 65; j <= i; j++) {
	     char ch = (char)j;	
	     System.out.print(ch+ " ");
	    }
	   System.out.println(" ");
	  }
	 }
}
