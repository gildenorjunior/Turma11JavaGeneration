package portugol;

import java.util.Scanner;

public class Lista01Exercicio04 {

	public static void main(String[] args) {
		
		//Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
		//calcule a seguinte express�o:

		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		double r, s, d;
		
		System.out.print("Digite o primeiro valor: ");
		a = leia.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		b = leia.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		c = leia.nextInt();
		
		r = Math.pow((a + b), 2);
		s = Math.pow((b + c), 2);
		
		d = ((r + s) / 2);
		
		System.out.printf("O valor de d � %.1f \n", d);
		System.out.printf("O valor de r � %.1f \n", r);
		System.out.printf("O valor de s � %.1f \n", s);
		
		leia.close();
	}

}
