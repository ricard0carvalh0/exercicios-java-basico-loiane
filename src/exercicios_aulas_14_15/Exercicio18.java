package exercicios_aulas_14_15;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma data no sistema 'dd/mm/aaaa' e eu direi se ela é válida (até o ano de 2024):");
		System.out.println("Primeiro, digite o dia:");
		int dia = scan.nextInt();
		System.out.println("Agora o mês:");
		int mes = scan.nextInt();
		System.out.println("E por fim, o ano:");
		int ano = scan.nextInt();
		
		if(dia>31 || mes>12 || ano>2024) {
			System.out.println(dia + "/" + mes + "/" + ano + " não é uma data válida.");
		} else {
			System.out.println(dia + "/" + mes + "/" + ano + " é uma data válida.");
		}
		
		scan.close();
	}

}
