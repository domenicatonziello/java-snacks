package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class Snack8 {
	public static void main(String[] args) {
		int evenNumber = 0;
		int oddInd = 0;
		Integer[] evenArray = new Integer[10];
		Integer[] oddArray = new Integer[10];

		Random random = new Random();
		for (int i=0; i<10; i++) {
			
			int rndVal = random.nextInt(101);
			
			System.out.println(rndVal);
			
			if (rndVal % 2 == 0) {
				
				evenArray[evenNumber++] = rndVal;
				
			} else {
				
				oddArray[oddInd++] = rndVal;
			}
		}
		System.out.println(Arrays.asList(evenArray));
		System.out.println(Arrays.asList(oddArray));
	}

}
