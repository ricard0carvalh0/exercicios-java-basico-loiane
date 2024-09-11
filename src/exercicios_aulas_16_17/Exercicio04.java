package exercicios_aulas_16_17;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int anos = 0;
		double popA = 80000;
		double popB = 200000;
		
		while(popA <= popB) {
			popA += (popA*3)/100;
			popB += (popB*1.5)/100;
			
			anos++;
		}
		
		System.out.println("Quantidade de anos para Cidade A ultrapassar ou igualar: " + anos);
	}

}
