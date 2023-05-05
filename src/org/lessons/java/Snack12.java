package org.lessons.java;

import java.util.Arrays;

public class Snack12 {
	public static void main(String[] args) {
		
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		int arr3Length = arr1.length + arr2.length;
		
		Integer[] arr3 = new Integer[arr3Length];
		
		for (int i = 0; i < arr1.length; i++) {
			int element1 = arr1[i];
			
			arr3[i] = element1;
			
			for (int x = 0; x < arr2.length; x++) {
				int element2 = arr2[x];
				
				arr3[arr1.length + x] = element2;
				
			}
		}
		
		System.out.println(Arrays.asList(arr1));
		System.out.println(Arrays.asList(arr2));
		System.out.println(Arrays.asList(arr3));
		
	}
}
