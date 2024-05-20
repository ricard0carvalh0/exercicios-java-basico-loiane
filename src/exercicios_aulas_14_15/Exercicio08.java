package exercicios_aulas_14_15;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o preço do primeiro item:");
		double item1 = scan.nextDouble();
		System.out.println("Digite o preço do segundo item:");
		double item2 = scan.nextDouble();
		System.out.println("Digite o preço do terceiro item:");
		double item3 = scan.nextDouble();

		if(item1<=item2 && item1<=item3) {
			System.out.println("Você deve comprar o item de preço: " + item1);
		} else if(item2<=item1 && item2<=item3) {
			System.out.println("Você deve comprar o item de preço: " + item2);
		} else if(item3<=item1 && item3<=item2) {
			System.out.println("Você deve comprar o item de preço: " + item3);
		}

		scan.close();
	}

}
