package lista01ExerciciosJavaBasico;

import java.util.Scanner;

public class Lista01Exercicio05 {

	public static void main(String[] args) {
		
		//Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
		//aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
		//respectivamente.

		Scanner leia = new Scanner(System.in);
			
		double n1, n2, n3, media;
		int peso1 = 2, peso2 = 3, peso3 = 5;
		
		System.out.print("Digite a primeiro nota: ");
		n1 = leia.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		n2 = leia.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		n3 = leia.nextDouble();
		
		media = (( (n1 * peso1) + (n2 * peso2) + (n3 * peso3) ) / 3);
		
		System.out.printf("Sua m�dia �: %.1f ", media);
		
		leia.close();
		
	}

}
