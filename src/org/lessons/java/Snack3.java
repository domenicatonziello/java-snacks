package org.lessons.java;

import java.util.Arrays;

public class Snack3 {
	public static void main(String[] args) {
		Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
		
		 // int getIndex = Arrays.asList(numbers).indexOf(7);
		 
		 int sum = 0;

	        for(int i = 0; i < numbers.length ; i++) {
	        	if(Arrays.asList(numbers).indexOf(i) % 2 != 0) {
	        		sum += numbers[i];
	        	}
	        }
	        
	        System.out.println(sum);
		
	}

}
