package exercicios_aulas_14_15;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma letra qualquer:");
		String letra = scan.next();

		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
				|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			System.out.println("Você digitou uma vogal.");
		} else if (letra.length() > 1){
			System.out.println("Você digitou mais de uma letra.");
		} else {
			System.out.println("Você digitou uma consoante.");
		}
		
		scan.close();
	}

}
