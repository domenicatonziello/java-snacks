package org.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class Snack5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("Digita un numero");
		int userNumber = sc.nextInt();
		sc.close();
		
		int sum = 0;
		int sumEven = 0;
		int media = 0;
		int mediadispari = 0;
		int min = 100;
		int max = 0;
		
		for(int i = 0; i < userNumber; i++) {
			Random random = new Random();
			int number = random.nextInt(100);
			System.out.println("numeri random"+ number);
			
			//somma
			sum += number;
			
			//media di tutti i valori
			media = sum / userNumber;
			
			//max
			if(max < number ) {
				max = number;
			}
			
			//min
			if (min > number) {
				min = number;
			}
			
			//somma numeri pari
			if(number % 2 == 0) {
				sumEven += number;
			} else {
				mediadispari = sum / userNumber;
			}
		}
		System.out.println("somma: " + sum);
		System.out.println("somma numeri pari: " + sumEven);
		System.out.println("Media di tutti i valori: " + media);
		System.out.println("Media dei valori dispari: " + mediadispari);
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		
	}
}
