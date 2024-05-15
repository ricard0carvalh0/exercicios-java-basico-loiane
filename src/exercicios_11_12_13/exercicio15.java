package exercicios_11_12_13;

import java.util.Scanner;

public class Exercicio15 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor recebido em horas:");
		double valor = scan.nextDouble();
		System.out.println("Digite a quantidade de horas trabalhadas no mês:");
		double horas = scan.nextDouble();
		
		double total = valor*horas;
		double ir = (total*11)/100;
		double inss = (total*8)/100;
		double sindicato = (total*5)/100;
		double salarioLiquido = total-ir-inss-sindicato;
		
		System.out.println("Total recebido (salário bruto mensal: " + total);
		System.out.println("Valor descontato para o Imposto de Renda: " + ir);
		System.out.println("Valor descontado para o INSS: " + inss);
		System.out.println("Valor descontado para o Sindicato: " + sindicato);
		System.out.println("Salário Líquido: " + salarioLiquido);
		
		scan.close();
	}
}
