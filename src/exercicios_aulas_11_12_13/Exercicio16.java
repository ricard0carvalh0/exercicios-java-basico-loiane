package exercicios_11_12_13;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio16 {

	public static void main(String[] args) {
		//Math.ceil() está sendo usado para arredondar os valores
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da área a ser pintada:");
		double area = scan.nextDouble();
		
		double litrosTinta = Math.ceil(area/3);
		double latasTinta = Math.ceil(litrosTinta/18);
		double valorTotal = latasTinta * 80;
		
		System.out.println("Quantidade de latas de tinta a serem compradas: " + latasTinta);
		System.out.println("Valor total a ser pago pelas latas de tinta: " + valorTotal);
		
		scan.close();
	}

}
