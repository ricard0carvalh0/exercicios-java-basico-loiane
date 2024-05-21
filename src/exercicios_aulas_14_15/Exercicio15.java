package exercicios_aulas_14_15;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado do triângulo:");
		double lado1 = scan.nextDouble();
		System.out.println("Digite o segundo lado do triângulo:");
		double lado2 = scan.nextDouble();
		System.out.println("Digite o terceiro lado do triângulo:");
		double lado3 = scan.nextDouble();;
		
		if((lado1+lado2) > lado3 || (lado2+lado3) > lado1 || (lado1+lado3) > lado2) {
			if(lado1==lado2 && lado2==lado3 && lado1==lado3) {
				System.out.println("Esse é um Triângulo Equilatero.");
			} else if(lado1==lado2 || lado2==lado3 || lado1==lado3) {
				System.out.println("Esse é um Triângulo Isósceles.");
			} else if(lado1!=lado2 && lado2!=lado3 && lado1!=lado3) {
				System.out.println("Esse é um Triângulo Escaleno.");
			}
		} else {
			System.out.println("Esses valores não formam um triângulo.");
		}
		
		scan.close();
	}

}
