package exercicios_aulas_11_12_13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a altura da pessoa:");
		double altura = scan.nextDouble();
		System.out.println("Digite o sexo da pessoa:");
		String sexo = scan.next();
		System.out.println("Digite o peso atual da pessoa:");
		double peso = scan.nextDouble();
		
		if(sexo.equalsIgnoreCase("masculino")) {
			double pesoIdeal = (72.7*altura)-58;
			if(peso<pesoIdeal) {
				System.out.println("A pessoa está abaixo do peso ideal.");
			} else if(peso>pesoIdeal) {
				System.out.println("A pessoa está acima do peso ideal.");
			} else {
				System.out.println("A pessoa está dentro do peso ideal.");
			}
			System.out.println("Peso ideal: " + pesoIdeal);
		} else if(sexo.equalsIgnoreCase("feminino")) {
			double pesoIdeal = (62.1*altura)-44.7;
			if(peso<pesoIdeal) {
				System.out.println("A pessoa está abaixo do peso ideal.");
			} else if(peso>pesoIdeal) {
				System.out.println("A pessoa está acima do peso ideal.");
			} else {
				System.out.println("A pessoa está dentro do peso ideal.");
			}
			System.out.println("Peso ideal: " + pesoIdeal);
		}
		
		scan.close();
	}

}
