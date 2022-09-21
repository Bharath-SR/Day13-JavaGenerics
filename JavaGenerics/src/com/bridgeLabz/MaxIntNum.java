/**
 * 
 */
package com.bridgeLabz;

/**
 * @author Admin
 *
 */
public class MaxIntNum {

	    public static void maxNumber(Float a, Float b, Float c) {
	    	  Float max = a;
		      
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
		Float a = 10.2f, b = 15.98f, c =105.8f;
	    maxNumber (a,b,c); 
	}

}
