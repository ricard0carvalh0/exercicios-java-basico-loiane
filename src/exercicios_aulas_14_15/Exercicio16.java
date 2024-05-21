package exercicios_aulas_14_15;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor de 'a':");
		double a = scan.nextDouble();

		if(a==0) {
			System.out.println("Essa não é uma equação de segundo grau.");
		} else {
			System.out.println("Digite o valor de 'b':");
			double b = scan.nextDouble();
			System.out.println("Digite o valor de 'c':");
			double c = scan.nextDouble();		

			double delta = (b*b)-4*a*c;
			double raizDelta = Math.sqrt(delta);

			if(delta>=0) {
				double x1 = ((-1)*b + raizDelta)/2*a;
				double x2 = ((-1)*b - raizDelta)/2*a;
				System.out.println("X1 = " + x1);
				System.out.println("X2 = " + x2);
			} else {
				System.out.println("Essa equação não possui raiz real.");
			}
		}
		
		scan.close();
	}

}
