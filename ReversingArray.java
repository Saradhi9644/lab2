package COM;

import java.util.*; 

public class ReversingArray {

	 static void reverse(Integer a[]) 
	    { 
	        Collections.reverse(Arrays.asList(a)); 
	        System.out.println(Arrays.asList(a)); 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	        Integer [] arr = {10, 20, 30, 40, 50}; 
	        reverse(arr); 
	    } 
}