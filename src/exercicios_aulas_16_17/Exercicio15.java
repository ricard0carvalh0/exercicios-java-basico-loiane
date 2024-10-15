package exercicios_aulas_16_17;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n;
		int primeiro = 1;
		int segundo = 1;
		int proximo = 0;
		
		System.out.println("Digite o n-ésimo termo");
		n = scan.nextInt();
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		for(int i=0; i<n; i++) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			System.out.println(proximo);
		}
		
		scan.close();
	}

}
