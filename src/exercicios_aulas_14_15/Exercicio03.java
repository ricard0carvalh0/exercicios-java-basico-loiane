package exercicios_aulas_14_15;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o sexo da pessoa como sendo F(feminino) ou M(masculino):");
		String sexo = scan.next();
		
		if(sexo.equalsIgnoreCase("F")) {
			System.out.println("A pessoa é do sexo feminino.");
		} else if(sexo.equalsIgnoreCase("M")) {
			System.out.println("A pessoa é do sexo masculino.");
		} else {
			System.out.println("Sexo inválido.");
		}
		
		scan.close();
	}

}
