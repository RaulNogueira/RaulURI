package Iniciante;

import java.util.Scanner;

public class URI1116 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X, Y;
		for (int i = 0; i < N; i++) {
			X = sc.nextInt();
			Y = sc.nextInt();
			if (Y == 0) System.out.println("divisao impossivel");
			else System.out.println((double) X / Y);
		}
	}

}
