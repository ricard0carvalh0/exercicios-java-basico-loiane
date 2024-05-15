package exercicios_aulas_11_12_13;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*Calculando e dobrando a área do quadrado*");
		
		System.out.println("Digite o lado do quadrado:");
		double lado = scan.nextDouble();
		
		double area = lado*lado;
		double dobroArea = area*2;
		
		System.out.println("A área desse quadrado é: " + area);
		System.out.println("O dobro dessa mesma área é: " + dobroArea);
		
		scan.close();
	}

}
