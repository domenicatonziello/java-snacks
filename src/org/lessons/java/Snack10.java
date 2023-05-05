package org.lessons.java;

import java.util.Scanner;

public class Snack10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserisci raggio del cerchio");
		int raggio = sc.nextInt();
		
		sc.close();
		
		//Area:
		double area = raggio * raggio * Math.PI;
		
		//Circonferenza 
		double circonferenza = 2 * raggio * Math.PI;
		
		System.out.println("AREA: " + area);
		System.out.println("CIRCONFERENZA: " + circonferenza);
		
	}
}
