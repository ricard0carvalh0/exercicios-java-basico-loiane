package exercicios_11_12_13;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade em quilos de peixe pescado:");
		double peso = scan.nextDouble();
		
		if(peso > 50) {
			double excesso = peso-50;
			double multa = excesso*4;
			System.out.println("Excesso: " + excesso);
			System.out.println("Multa: " + multa + "R$");
		} else {
			double excesso = 0;
			double multa = 0;
			System.out.println("Excesso: " + excesso + "(ZERO)");
			System.out.println("Multa: " + multa + "R$(ZERO R$)");
		}

	}

}
