package Iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class URI1248 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < N; i++) {
			boolean cheater = false;
			String dieta  = sc.nextLine();
			String cafe   = sc.nextLine();
			String almoco = sc.nextLine();
			
			for (char c : cafe.toCharArray()) {
				String str = String.valueOf(c);
				if (dieta.contains(str)) {
					dieta = dieta.replace(str, "");
				} else {
					cheater = true;
				}
			}
			
			for (Character c : almoco.toCharArray()) {
				String str = String.valueOf(c);
				if (dieta.contains(str)) {
					dieta = dieta.replace(str, "");
				} else {
					cheater = true;
				}
			}
			
			if (cheater) {
				System.out.println("CHEATER");
			} else {
				char[] string = dieta.toCharArray();
				Arrays.sort(string);
				System.out.println(new String(string));
			}
		}
	}

}
