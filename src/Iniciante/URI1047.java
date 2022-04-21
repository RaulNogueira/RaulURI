package Iniciante;

import java.util.Scanner;

public class URI1047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hInicio = sc.nextInt();
		int mInicio = sc.nextInt();
		int hFim = sc.nextInt();
		int mFim = sc.nextInt();
		int totalH = hFim - hInicio;
		int totalM = mFim - mInicio;
		
		if (totalH < 0) {
			totalH = 24 + (hFim - hInicio);
		}
		
		if (totalM < 0) {
			totalM = 60 + (mFim - mInicio);
			totalH--;
		}
		
		if (hInicio == hFim && mInicio == mFim) System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		else System.out.println("O JOGO DUROU "+ totalH + " HORA(S) E " + totalM + " MINUTO(S)");
	}

}
