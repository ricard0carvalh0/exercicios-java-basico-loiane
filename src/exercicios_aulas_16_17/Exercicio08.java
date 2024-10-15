package exercicios_aulas_16_17;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double numero, soma = 0, media = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o " + (i+1) + "° número:");
			numero = scan.nextDouble();
			soma += numero;
		}
		
		media = soma / 5;
		
		System.out.println("A soma de todos os 5 números é igual a " + soma);
		System.out.println("A média de todos os 5 números é igual a " + media);
		
		scan.close();
	}

}
