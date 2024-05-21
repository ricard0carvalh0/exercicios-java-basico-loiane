package exercicios_aulas_14_15;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da hora trabalhada:");
		double valor = scan.nextDouble();
		System.out.println("Digite a quantidade de horas trabalhadas no mês:");
		int hora = scan.nextInt();
		
		double salarioBruto = valor*hora;
		double salarioLiquido = 0;
		int ir = 0;
		double descontoIr = 0;
		int inss = 10;
		double descontoInss = 0;
		double descontoFgts = 0;
		
		if(salarioBruto <= 900.00) {
			ir = 0;
			descontoIr = 0;
			descontoInss = (salarioBruto*10)/100;
			descontoFgts = (salarioBruto*11)/100;
		} else if(salarioBruto <= 1500.00) {
			ir = 5;
			descontoIr = (salarioBruto*5)/100;
			descontoInss = (salarioBruto*10)/100;
			descontoFgts = (salarioBruto*11)/100;
		} else if(salarioBruto <= 2500.00) {
			ir = 10;
			descontoIr = (salarioBruto*5)/100;
			descontoInss = (salarioBruto*10)/100;
			descontoFgts = (salarioBruto*11)/100;
		} else if(salarioBruto > 2500.00) {
			ir = 20;
			descontoIr = (salarioBruto*20)/100;
			descontoInss = (salarioBruto*10)/100;
			descontoFgts = (salarioBruto*11)/100;
		}
		
		double totalDesconto = descontoIr+descontoInss;
		salarioLiquido = salarioBruto-(totalDesconto);
		
		System.out.println("Salário Bruto: (" + valor + " * " + hora + ")	: R$" + salarioBruto);
		System.out.println("(-) IR: (" + ir + "%)	: R$" + descontoIr);
		System.out.println("(-) INSS: (" + inss + "%)	: R$" + descontoInss);
		System.out.println("FGTS (11%)	: R$" + descontoFgts);
		System.out.println("Total de desconto	: R$" + totalDesconto);
		System.out.println("Salário Líquido	: R$" + salarioLiquido);
		
		scan.close();
	}

}
