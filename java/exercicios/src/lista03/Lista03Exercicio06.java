package lista03;

import java.util.Scanner;

public class Lista03Exercicio06 {
	/*
	 * Escrever um programa que receba v�rios n�meros inteiros no teclado.
	 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3.
	 * Para sair digitar 0(zero).(DO...WHILE)
	 */

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		int leitura, cont3 =0;
		double soma3 =0;
		
		do {
			System.out.print("Digite um numero :");
			leitura = leia.nextInt();
			if (leitura%3 ==0 && leitura !=0) {
				soma3 = soma3 + leitura;
				cont3++;
			}
			
		} while (leitura !=0);
		soma3 = soma3/cont3;
		
		System.out.println("M�dia dos n�meros multiplos de 3 � :"+soma3);

	}

}