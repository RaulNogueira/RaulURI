package Iniciante;

import java.util.Scanner;

public class URI1017 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     int tempo = sc.nextInt();
	     int velocidade = sc.nextInt();
	     double kilometros = tempo * velocidade;
	     double media = kilometros / 12;
	     System.out.println(String.format("%.3f", media)); 
	}

}
