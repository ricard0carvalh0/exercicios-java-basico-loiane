package exercicios_11_12_13;

import java.util.Scanner;

public class exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite outro número:");
		int numero2 = scan.nextInt();
		
		int soma = numero1 + numero2;
		System.out.println("A soma desses dois npumeros é: " + soma);
	}
}
