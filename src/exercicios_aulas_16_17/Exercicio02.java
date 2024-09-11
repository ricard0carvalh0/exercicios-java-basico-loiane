package exercicios_aulas_16_17;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean valido = false;
		
		while(!valido) {
			System.out.println("Digite o seu nome:");
			String nome = scan.next();
			System.out.println("Digite a sua senha:");
			String senha = scan.next();
			
			if(nome.equalsIgnoreCase(senha)) {
				System.out.println("A senha não pode ser igual ao seu nome. Tente novamente.");
			} else {
				System.out.println("Efetuado com sucesso!");
				valido = true;
			}
		}

		scan.close();
	}

}
