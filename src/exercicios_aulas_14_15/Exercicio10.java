package exercicios_aulas_14_15;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o turno em que você estudar ('M-Matutino', 'V-Vespertino' ou 'N-Noturno'):");
		String resposta = scan.next();

		switch (resposta) {
		case "M":
			System.out.println("Bom dia!");
			break;
		case "V":
			System.out.println("Boa tarde!");
			break;
		case "N":
			System.out.println("Boa noite!");
			break;
		default :
			System.out.println("Valor inválido.");
		}
		
		scan.close();

	}

}
