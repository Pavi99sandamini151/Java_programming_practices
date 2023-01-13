package com.nested_patterns;

public class nested_pattern_five {
	public static void main(String[] args) {
	 int k = 1;	
	System.out.println("Displaying right triangle pattern of numbers: ");	
	// Outer for loop.
	  for(int i = 1; i <= 5; i++)
	  {
	 // Inner for loop.
		for(int j = 1; j <= i; j++){
	     System.out.print(k+ " ");
	    }
	   System.out.println(" ");
	   k++;
	  }
	 }
}
