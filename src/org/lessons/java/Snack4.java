package org.lessons.java;

import java.util.Scanner;

public class Snack4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digita una parola");
		
		String wordUser = sc.nextLine();
		
		sc.close();
		
		String textReverse = "";
		
		int wordLength = wordUser.length()-1;
		
	    for(int i = wordLength; i >= 0 ; i-- ){
	        textReverse += wordUser.charAt(i);
	    }
	    Boolean isPalindroma = false;
	    if(wordUser.equals(textReverse)) {
	    	isPalindroma = true;
	    }
	    System.out.println("testo girato " + textReverse);
	    System.out.println(isPalindroma ? "La tua parola è palindroma" : "La tua parola non è palindroma");
			
	}
}
