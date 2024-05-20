package exercicios_aulas_14_15;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um primeiro número:");
		int num1 = scan.nextInt();
		System.out.println("Digite um segundo número:");
		int num2 = scan.nextInt();
		
		if(num1>num2) {
			System.out.println("Maior número digitado: " + num1);
		} else if(num2>num1) {
			System.out.println("Maior número digitado: " + num2);
		} else {
			System.out.println("Os dois valores digitados são iguais (" + num1 + " = " + num2 + ").");
		}
		
		scan.close();
	}

}
