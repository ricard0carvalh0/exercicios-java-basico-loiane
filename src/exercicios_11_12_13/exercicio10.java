package exercicios_11_12_13;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma temperatura qualquer em graus Celsius:");
		double celsius = scan.nextDouble();
		
		double farenheit = (celsius*1.8)+32;
		
		System.out.println("Convertendo para Farenheit: " + farenheit);
		
		scan.close();
	}

}
