package lista02ExerciciosJavaBasico;

import java.util.Scanner;

public class Lista02Exercicio04 {

	public static void main(String[] args) {
		
		//Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		//n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
		//�mpar exiba o n�mero elevado ao quadrado.
		
		double valor, resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		valor = leia.nextInt();
		
		if((valor % 2) == 0 && (valor > 0))
		{
			resultado = Math.sqrt(valor);
			System.out.println("O valor digitado � par e sua raiz �: " + resultado);
		}
		else if ((valor % 2) == 1 && (valor > 0))
		{
			resultado = Math.pow(valor, 2);
			System.out.println("O valor digitado � �mpar e sua eleva��o ao quadrado �: " + resultado);
		}
		else
		{
			System.out.println("Valor inv�lido!");
		}

	}

}
