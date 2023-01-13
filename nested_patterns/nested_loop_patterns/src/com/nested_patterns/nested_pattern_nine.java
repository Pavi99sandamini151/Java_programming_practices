package com.nested_patterns;

public class nested_pattern_nine {
	public static void main(String[] args) 
	{
	 int k = 65;	
	 System.out.println("Displaying alphabet pattern: ");	
	// Outer for loop.
	  for(int i = 65; i <= 69; i += 2) 
	  { 
	// Inner for loop. 
	   for(int j = 69; j >= 65; j--)
	   {
	     if(j > i)
		System.out.print(" ");	
	     else	 
	        System.out.format("%c ", k++);
	    }
	   System.out.println(" ");
	  }
	 }
}
