package logipro5;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Número: ");
		int numero = scanner.nextInt();
		int soma = 0;
		
		while(numero > 0) {
			soma += numero % 10;
			numero /= 10;
		}
		System.out.println("Valor total será: " + soma);
	}
}