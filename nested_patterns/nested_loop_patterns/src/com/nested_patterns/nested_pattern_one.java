package com.nested_patterns;

public class nested_pattern_one {
	
	public static void main(String[] args) {
		
	  for(int i = 1; i <= 4; i++)
	  {
	    System.out.print(i+ "\n"); // will execute 3 times.
	 // Inner for loop.
	    for(int j = 1; j <= 4; j++){
	      System.out.print(j+ " "); // will execute 12 (3 * 4) times.
	    }
	    System.out.println(" ");
	   }
	  }
}
