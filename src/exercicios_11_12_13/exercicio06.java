package exercicios_11_12_13;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*Calculando a área de um circulo*");
		System.out.println("Digite o raio do circulo:");
		double raio = scan.nextDouble();
		
		double area = 3.14*(raio*raio);
		
		System.out.println("A área desse circulo é: " + area);

	}

}
