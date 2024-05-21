package exercicios_aulas_14_15;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno:");
		double n1 = scan.nextDouble();
		System.out.println("Digite a segunda nota do aluno:");
		double n2 = scan.nextDouble();
		
		double media = (n1+n2)/2;
		String conceito = null;
		String situacao = null;
		
		if(media>=9.0 && media<=10.0) {
			conceito = "A";
			situacao = "Aprovado";
		} else if(media>=7.5 && media<9.0) {
			conceito = "B";
			situacao = "Aprovado";
		} else if(media>=6.0 && media<7.5) {
			conceito = "C";
			situacao = "Aprovado";
		} else if(media>=4.0 && media<6.0) {
			conceito = "D";
			situacao = "Reprovado";
		} else if(media>= 0.0 && media<4.0) {
			conceito = "E";
			situacao = "Reprovado";
		}
		
		System.out.println("Notas do aluno:");
		System.out.println("Primeira nota: " + n1);
		System.out.println("Segunda nota: " + n2);
		System.out.println("Média: " + media);
		System.out.println("Conceito: " + conceito);
		System.out.println("Situação: " + situacao);
		
		scan.close();
	}

}
