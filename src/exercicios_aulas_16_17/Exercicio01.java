package exercicios_aulas_16_17;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean valido = false;
		
		while(!valido) {
			System.out.println("Digite uma nota entre 0 e 10:");
			int nota = scan.nextInt();
			if(nota >= 0 && nota <= 10) {
				valido = true;
			} else {
				System.out.println("Valor inválido. Tente novamente.");
			}
		}
		
		scan.close();
	}

}
