package Iniciante;

import java.io.IOException;
import java.util.Scanner;

public class URI1016 {
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        int minutos = (60 * km) / 30;
        System.out.println(minutos + " minutos"); 
    }
}
