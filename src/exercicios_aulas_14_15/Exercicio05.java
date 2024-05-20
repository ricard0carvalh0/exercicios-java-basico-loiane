package exercicios_aulas_14_15;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno:");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a segunda nota do aluno:");
		double nota2 = scan.nextDouble();
		
		double media = (nota1+nota2)/2;
		
		if(media==10) {
			System.out.println("Aprovado com distinção");
		} else if(media<7) {
			System.out.println("Reprovado");
		} else if(media>=7) {
			System.out.println("Aprovado");
		}
		
		scan.close();
	}

}
