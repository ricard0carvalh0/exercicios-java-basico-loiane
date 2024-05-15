package exercicios_11_12_13;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno:");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a segunda nota do aluno:");
		double nota2 = scan.nextDouble();
		System.out.println("Digite a terceira nota do aluno:");
		double nota3 = scan.nextDouble();
		System.out.println("Digite a quarta nota do aluno:");
		double nota4 = scan.nextDouble();
		
		double media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("Média do aluno: " + media);
		
		scan.close();
	}

}
