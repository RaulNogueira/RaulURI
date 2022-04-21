package Iniciante;

import java.math.BigInteger;
import java.util.Scanner;

public class URI1120 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			BigInteger D = sc.nextBigInteger();
			BigInteger N = sc.nextBigInteger();
			if (D.equals(BigInteger.ZERO) && N.equals(N.ZERO)) {
				break;
			} else {
				String V = N.toString().replace(D.toString(), "");
				if (V.isEmpty())
					System.out.println(0);
				else 
					System.out.println(new BigInteger(V));
			}
		}
	}

}
