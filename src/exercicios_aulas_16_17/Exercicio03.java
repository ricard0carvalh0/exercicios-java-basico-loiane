package exercicios_aulas_16_17;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean valido = false;

		while (!valido) {
			System.out.println("Digite o seu nome:");
			String nome = scan.next();

			if (nome.length() >= 3) {
				valido = true;
			} else {
				System.out.println("Nome inválido. (Mínimo de 3 letras)");
			}
		}

		valido = false;
		do {

			System.out.println("Digite a sua idade:");
			int idade = scan.nextInt();

			if (!(idade > 0 && idade <= 150)) {
				System.out.println("Tente novamente. (Sua idade deve ser entre 0 e 150 anos)");
			} else {
				valido = true;
			}

		} while (!valido);

		valido = false;
		while (!valido) {
			System.out.println("Digite o valor do seu salário:");
			double salario = scan.nextDouble();

			if (salario > 0) {
				valido = true;
			} else {
				System.out.println("Tente novamente. (Seu salário deve ser maior que 0)");
			}
		}

		valido = false;
		while (!valido) {
			System.out.println("Digite o seu sexo:");
			String sexo = scan.next();

			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				valido = true;
			} else {
				System.out.println("Sexo inválido. Tente novamente.");
			}
		}

		valido = false;
		while (!valido) {
			System.out.println("Digite seu estado civil ('s', 'c', 'v', 'd')");
			String estadoCivil = scan.next();

			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
					|| estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				valido = true;
			} else {
				System.out.println("Estado civil inválido. Tente novamente.");
			}
		}
		
		scan.close();
	}

}
