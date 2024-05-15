package exercicios_aulas_11_12_13;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*Convertendo metros para centímetro*");
		System.out.println("Digite o valor em metros que queira converter:");
		int metros = scan.nextInt();
		
		int centimetros = metros*100;
		
		System.out.println(metros + " em centímetros: " + centimetros);
		
		scan.close();
	}

}
