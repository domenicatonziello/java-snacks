package org.lessons.java;

import java.util.Scanner;

public class Snack9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Inserisci un valore per la base");
		int base = sc.nextInt();
		
		
		System.out.println("inserisci altezza");
		int altezza = sc.nextInt();
		
		sc.close();
		
		//AREA
		
		int area = base * altezza;
		
		//PERIMETRO
		int perimetro =2*base + 2*altezza;
		
		System.out.println("Area: " + area);
		System.out.println("Perimetro: " + perimetro);
	}
}
