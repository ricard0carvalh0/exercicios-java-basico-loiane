package exercicios_aulas_16_17;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero, maiorNumero = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o " + (i+1) + "° número:");
			numero = scan.nextInt();
			if (i == 0) {
				maiorNumero = numero;
			} else if (numero > maiorNumero) {
				maiorNumero = numero;
			}
		}
		
		System.out.println("O maior número digitado foi o número: " + maiorNumero);
		
		scan.close();
	}

}
