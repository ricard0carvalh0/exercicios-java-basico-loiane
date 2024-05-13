package exercicios_11_12_13;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		int numero1 = scan.nextInt();
		System.out.println("Digite um segundo número inteiro");
		int numero2 = scan.nextInt();
		System.out.println("Agora, digite um número real:");
		double numero3 = scan.nextDouble();
		
		int letraA = (numero1*2)*(numero2/2);
		double letraB = (numero1*3)+numero3;
		double letraC = (numero3*numero3*numero3);
		
		System.out.println("Resposta questão a: " + letraA);
		System.out.println("Resposta questão b: " + letraB);
		System.out.println("Resposta questão c: " + letraC);

	}

}
