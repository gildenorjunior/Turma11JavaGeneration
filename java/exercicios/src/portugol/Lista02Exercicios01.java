package portugol;

import java.util.Scanner;

public class Lista02Exercicios01 {

	public static void main(String[] args)
	{
		//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		int valor1, valor2, valor3, maior;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		valor1 = leia.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		valor2 = leia.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		valor3 = leia.nextInt();
		
		if(valor1 > valor2 && valor1 > valor3)
		{
			maior = valor1;
			System.out.println("O primeiro valor digitado � o maior: " + valor1);
		}else if(valor2 > valor1 && valor2 > valor3)
		{
			maior = valor2;
			System.out.println("O segundo valor digitado � o maior: " + valor2);
		}else if(valor3 > valor1 && valor3 > valor2)
		{
			maior = valor3;
			System.out.println("O terceiro valor digitado � o maior: " + valor3);
		}
		
		
	}
	
}
