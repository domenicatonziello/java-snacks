package org.lessons.java;

import java.util.Random;

public class Snack7 {
	public static void main(String[] args) {
		int randomNumber = 0;
		Random random = new Random();
		do {
			
			randomNumber = random.nextInt(101);
			System.out.println(randomNumber);
		} while(randomNumber % 3 != 0 || randomNumber % 5 != 0);
	}
}
