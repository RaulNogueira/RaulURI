package Iniciante;

import java.util.Scanner;

public class URI1234 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			boolean upper = true;
			StringBuilder frase = new StringBuilder(sc.nextLine());
			for (int i = 0; i < frase.length(); i++) {
				char c = frase.charAt(i);
				if (Character.isAlphabetic(c)) {
					if (upper) 	frase.setCharAt(i, Character.toUpperCase(c));
					else 		frase.setCharAt(i, Character.toLowerCase(c));
					upper =! upper;
				}
			}
			System.out.println(frase);
		}
	}

}
