package exercicios_aulas_16_17;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int base, expoente;
		int resultado = 1;
		
		System.out.println("Digite a base:");
		base = scan.nextInt();
		
		System.out.println("Digite o expoente:");
		expoente = scan.nextInt();
		
		for(int i = 0; i < expoente; i++) {
			resultado *= base;
		}
		
		System.out.println("Resultado: " + resultado);

		scan.close();
	}

}
