/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.
*/

package lista04;

import java.util.Scanner;

public class Lista04Exercicio02 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int valores[] = new int[6];
		int somaPares = 0;
		int contImpares = 0;
		
		for(int i = 0 ; i < 6 ; i++)
		{
			System.out.print("Digite um valor: ");
			valores[i] = leia.nextInt();
		}
		
		System.out.println();
		
		for(int i = 0 ; i < 6 ; i++)
		{
			if((valores[i] % 2) == 0)
			{
				somaPares = valores[i] + somaPares;
				System.out.println("PAR: " + valores[i]);
			}
		}
		
		System.out.println();
		
		for(int i = 0 ; i < 6 ; i++)
		{
			if((valores[i] % 2) == 1)
			{
				System.out.println("IMPAR: " + valores[i]);
				contImpares++;
			}
		}
		
		System.out.println();
		System.out.println("Soma dos n�meros pares digitados: " + somaPares);
		System.out.println("Quantidade de n�meros impares digitados: " + contImpares);
	}

}
