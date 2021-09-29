package exemplos_condicionais;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		float num1 = teclado.nextFloat();
		System.out.println("Digite o segundo número:");
		float num2 = teclado.nextFloat();
		
		float maior = maiorNumero(num1,num2);
		
		if(maior == 0) {
			System.out.println("Os números são iguais!!!");
		}else {
			System.out.printf("O maior número é o %.1f",maior);
		}
	}
	
	private static float maiorNumero(float num1,float num2) {
		if(num1==num2) {
			return 0;
		}
		
		if(num1>num2) {
			return num1;
		}
			return num2;
	}

}
