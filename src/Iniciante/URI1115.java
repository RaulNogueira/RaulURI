package Iniciante;

import java.util.Scanner;

public class URI1115 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		while (X != 0 && Y != 0) {
			if (X == 0 || Y == 0) break;
			else if (Y > 0 && X > 0) System.out.println("primeiro");
			else if (Y > 0 && X < 0) System.out.println("segundo");
			else if (Y < 0 && X < 0) System.out.println("terceiro");
			else if (Y < 0 && X > 0) System.out.println("quarto");
			X = sc.nextInt();
			Y = sc.nextInt();
		}
	}

}
