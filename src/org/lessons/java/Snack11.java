package org.lessons.java;

import java.util.Scanner;

public class Snack11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci un numero");
		int value = sc.nextInt();
		
		sc.close();
		
		for(int i= 1; i <= value ; i++) {
			if(value % i == 0) {
				System.out.println(value + " è divisibile per " + i);
			} 
		}
	}
}
