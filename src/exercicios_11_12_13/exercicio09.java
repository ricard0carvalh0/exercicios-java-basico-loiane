package exercicios_11_12_13;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma temperatura qualquer em graus Farenheit:");
		double farenheit = scan.nextDouble();
		
		double celsius = (5*(farenheit-32)/9);
		
		System.out.println("Convertendo para Celsius: " + celsius);
		
		scan.close();
	}

}
