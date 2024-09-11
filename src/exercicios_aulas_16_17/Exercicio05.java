package exercicios_aulas_16_17;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int anos = 0;
		double popA, popB, taxaA, taxaB;
		boolean valido;
		
		valido = false;
		do {
			System.out.println("Digite a população inicial do país A:");
			popA = scan.nextDouble();
			if(popA>0) {
				valido = true;
			} else {
				System.out.println("A população precisa ser maior que 0.");
				valido = false;
			}
		} while(!valido);
		
		valido = false;
		do {
			System.out.println("Digite a população inicial do país B:");
			popB = scan.nextDouble();
			if(popB>0 && popB>popA) {
				valido = true;
			} else {
				System.out.println("A população precisa ser maior que 0 e maior que a população do país A.");
				valido = false;
			}
		} while(!valido);

		valido = false;
		do {
			System.out.println("Digite a taxa de crescimento do país A:");
			taxaA = scan.nextDouble();
			if(taxaA>0) {
				valido = true;
			} else {
				System.out.println("A taxa de crescimento precisa ser maior que 0");
				valido = false;
			}
		} while(!valido);
		
		valido = false;
		do {
			System.out.println("Digite a taxa de crescimento do país B:");
			taxaB = scan.nextDouble();
			if(taxaB>0 && taxaB<taxaA) {
				valido = true;
			} else {
				System.out.println("A taxa de crescimento precisa ser maior que 0 e menor que a taxa de crescimento do país A.");
				valido = false;
			}
		} while(!valido);
		
		while(popA <= popB) {
			popA += (popA*taxaA)/100;
			popB += (popB*taxaB)/100;
			
			anos++;
		}
		
		System.out.println("Quantidade de anos para Cidade A ultrapassar ou igualar: " + anos);
		
		scan.close();
	}
}