package Iniciante;

import java.util.Scanner;

public class URU1010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int cod1 = sc.nextInt();
        int n1 = sc.nextInt();
        double valor1 = sc.nextDouble();
		
        int cod2 = sc.nextInt();
        int n2 = sc.nextInt();
        double valor2 = sc.nextDouble();
		
        double total = (n1 * valor1) + (n2 * valor2);
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));  
	}

}
