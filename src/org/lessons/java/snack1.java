package org.lessons.java;

import java.util.Scanner;

public class snack1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digita un numero");
		int userNumber = sc.nextInt();
		
		if(userNumber % 2 == 0) {
			System.out.println(userNumber);
		} else {
			System.out.println(userNumber + 1);
		}
		
		sc.close();
		
	}
}
