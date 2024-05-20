package exercicios_aulas_14_15;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número qualquer:");
		int num = scan.nextInt();
		
		if(num<0) {
			System.out.println("Esse número é um número negativo.");
		} else {
			System.out.println("Esse número é um número positivo.");
		}
		
		scan.close();
	}

}
