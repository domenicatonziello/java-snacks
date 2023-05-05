package org.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class Snack6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digita un numero");
		int limite = sc.nextInt();
		
		sc.close();
		
		int sum = 0;
		Random random = new Random();
		
		while (sum < limite) {
			int number = random.nextInt(100);
				sum += number;				
			System.out.println("estratto: " + number);
		}
		System.out.println("somma: "+sum);
	}
}
