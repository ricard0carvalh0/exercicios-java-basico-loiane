package exercicios_aulas_14_15;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno:");
		double n1 = scan.nextDouble();
		System.out.println("Digite a segunda nota do aluno:");
		double n2 = scan.nextDouble();
		System.out.println("Digite a terceira nota do aluno:");
		double n3 = scan.nextDouble();
		
		double media = (n1+n2+n3)/3;
		
		if(media==10 && media<11) {
			System.out.println("Aprovado com distinção!");
		} else if(media>=7 && media<10) {
			System.out.println("Aprovado.");
		} else if(media<=7 && media>0) {
			System.out.println("Reprovado.");
		} else {
			System.out.println("Alguma nota pode estar inválida.");
		}
		
		scan.close();
	}

}
