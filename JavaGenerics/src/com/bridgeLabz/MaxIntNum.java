/**
 * 
 */
package com.bridgeLabz;

/**
 * @author Admin
 *
 */
public class MaxIntNum {

	    public static void maxNumber(Integer a, Integer b, Integer c) {
	        Integer max = a;
	      
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
		 Integer a = 70, b = 10, c =200;
		 maxNumber (a,b,c); 

	}

}
