package exercicios_11_12_13;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a altura da pessoa:");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7*altura)-58;
		
		System.out.println("O peso ideal dessa pessoa é: " + pesoIdeal);

	}

}
