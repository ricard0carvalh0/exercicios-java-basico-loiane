package exercicios_aulas_14_15;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o salário do colaborador:");
		double salario = scan.nextDouble();
		double salarioAjustado = 0;
		int percentual = 0;
		double valorAumento = 0;
		
		if(salario <= 280.00) {
			salarioAjustado = salario + ((salario*20)/100);
			percentual = 20;
			valorAumento = ((salario*20)/100);
		} else if(salario > 280.00 && salario <= 700.00) {
			salarioAjustado = salario + ((salario*15)/100);
			percentual = 15;
			valorAumento = ((salario*15)/100);
		} else if(salario > 700.00 && salario <= 1500.00) {
			salarioAjustado = salario + ((salario*10)/100);
			percentual = 10;
			valorAumento = ((salario*10)/100);
		} else if(salario > 1500.00) {
			salarioAjustado = salario + ((salario*5)/100);
			percentual = 5;
			valorAumento = ((salario*5)/100);
		}
		
		System.out.println("Salário antes do reajuste: " + salario);
		System.out.println("Percentual do reajuste: " + percentual + "%.");
		System.out.println("Valor do reajuste: " + valorAumento);
		System.out.println("Novo salário: " + salarioAjustado);
		
		scan.close();		
	}

}
