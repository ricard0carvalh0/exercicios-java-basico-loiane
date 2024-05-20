package exercicios_aulas_14_15;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo número:");
		int num2 = scan.nextInt();
		System.out.println("Digite o terceiro número:");
		int num3 = scan.nextInt();
		
		if(num1>=num2 && num1>=num3) {
			System.out.println("O maior número digitado foi o número: " + num1);
		} else if(num2>=num1 && num2>=num3) {
			System.out.println("O maior número digitado foi o número: " + num2);
		} else if(num3>=num2 && num3>=num1) {
			System.out.println("O maior número digitado foi o número: " + num3);
		}
		
		if(num1<=num2 && num1<=num3) {
			System.out.println("O menor número digitado foi o número: " + num1);
		} else if(num2<=num1 && num2<=num3) {
			System.out.println("O menor número digitado foi o número: " + num2);
		} else if(num3<=num2 && num3<=num1) {
			System.out.println("O menor número digitado foi o número: " + num3);
		}
		
		scan.close();
	}

}
