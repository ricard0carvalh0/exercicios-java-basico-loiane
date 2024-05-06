package exercicios_11_12_13;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor recebido por hora trabalhada:");
		double valor = scan.nextDouble();
		System.out.println("Digite a quantidade de horas trabalhadas no mês:");
		int hora = scan.nextInt(); 
		
		double salarioMensal = valor*hora;
		
		System.out.println("Seu salário mensal: " + salarioMensal);
	}

}
