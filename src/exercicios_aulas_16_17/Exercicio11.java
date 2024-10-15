package exercicios_aulas_16_17;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n1, n2, soma = 0;
		
		System.out.println("Digite o primeiro número inteiro:");
		n1 = scan.nextInt();
		System.out.println("Digite o segundo número inteiro:");
		n2 = scan.nextInt();
		
		System.out.println("Todos os números inteiros compreendidos no intervalo entre eles:");
		for (int i = n1+1; i < n2; i++) {
			System.out.print(i + " ");
			soma += i;
		}
		
		System.out.println();
		System.out.println("A soma de todos eles é igual a " + soma);
		
		scan.close();

	}

}
