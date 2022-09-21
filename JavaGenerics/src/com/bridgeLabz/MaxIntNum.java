/**
 * 
 */
package com.bridgeLabz;

/**
 * @author Admin
 *
 */
public class MaxIntNum {

	    public static<T extends  Comparable <T>>  T maxValue(T max1 , T max2, T max3 ,T max4,T max5) {

			T max = max1;

			/*
		        check condition
			 */
			if (max2.compareTo(max) > 0 ) {
				max = max2;
			} if (max3.compareTo(max) > 0){
				max = max3;
			}if (max4.compareTo(max) > 0 ){
				max = max4;
			}if (max5.compareTo(max) > 0){
				max = max5;

			}
			return max;
	    }
	public static void main(String[] args) {
		// DrivingClass
		System.out.println( "The maximum value is = " + maxValue(45,100,12,45,89));
	}

}
