package exercicios_aulas_16_17;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num;
		int par = 0;
		int impar = 0;
		
		System.out.println("Digite 10 números inteiros:");
		
		for(int i=0; i<10; i++) {
			System.out.println("Digite:");
			num = scan.nextInt();
			if(num % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.println("Quantidade de números pares: " + par);
		System.out.println("Quantidade de números impares: " + impar);
		
		scan.close();
	}

}
