package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class Snack2 {
	public static void main(String[] args) {
		String[] listName = {"Giovanni", "Marco", "Antonio", "Mario" };
		String[] listSurname = {"cognome1", "cognome2", "cognome3", "cognome4"};
		
		for (int i = 0; i < listName.length ; i++) {
		Random nRandom = new Random ();
		int val1 = nRandom.nextInt(listName.length);
		int val2 = nRandom.nextInt(listSurname.length);
		
		System.out.println(listName[val1] + " " + listSurname[val2]);
		}
	}

}
