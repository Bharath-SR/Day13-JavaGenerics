/**
 * 
 */
package com.bridgeLabz;

/**
 * @author Admin
 *
 */
public class MaxIntNum {

	    public static void maxString(String a, String b, String c) {
	    	  String max = a;
		      
		        if(b.compareTo(a)>0){
		            max = b;
		        }
		        if(c.compareTo(max)>0){
		            max = c;
		        }
		        System.out.println("Maximum Number is = "+max);
		    }
	public static void main(String[] args) {
		// DrivingClass
		String a = "Apple", b = "peach", c ="banana";
		maxString (a,b,c); 
	}

}
