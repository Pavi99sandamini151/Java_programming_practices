package com.nested_patterns;

public class nested_pattern_ten {
	public static void main(String[] args) 
	{
	 int i, j, k = 1;
	 for(i = 1; i <= 5; i += 2) 
	 { 
	   for(j = 5; j >= 1; j--)
	  {
	    if(j > i)
	       System.out.print(" ");
	    else
	       System.out.print(k++ +" ");  
	   }
	   System.out.println();
	  }
	 }
}
