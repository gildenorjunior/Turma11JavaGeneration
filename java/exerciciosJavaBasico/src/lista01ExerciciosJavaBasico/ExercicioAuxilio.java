package lista01ExerciciosJavaBasico;

import java.util.Scanner;

public class ExercicioAuxilio {

	public static void main(String[] args)
	{
		
		/*
		 * * chefe de familia
		 * ler nome e ano de nascimetno  e se � chefe de familia e o sexo * 
		 * >= 18  idade e for chefe de familia recebe 600 reais
		 * se for feminino  recebe o dobro
		 * 
		 */
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int anoNascimento, idade;
		char chefeFamilia, sexo;
		
		System.out.print("Informe seu nome: ");
		nome = leia.next();
		
		System.out.print("Informe seu ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		idade = (2020 - anoNascimento);
		
		System.out.print("Informe seu g�nero (M - Masculino) ou (F - Feminino): ");
		sexo = leia.next().toUpperCase().charAt(0);
		
		System.out.print("Informe se � chefe(a) de familia (S - Sim) ou (N - N�o): ");
		chefeFamilia = leia.next().toUpperCase().charAt(0);
		
		
		if(idade >= 18 && sexo == 'F' && chefeFamilia == 'S') 
		{
			System.out.printf("%s, voc� tem %d anos e voc� receber� o dobro do auxilio!", nome, idade);
		}
		else if(idade >= 18 && sexo == 'F' && chefeFamilia == 'N')
		{
			System.out.printf("%s, voc� tem %d anos e voc� n�o se enquandra para receber o auxilio!", nome, idade);
		}
		else if(idade >= 18 && sexo == 'M' && chefeFamilia == 'S')
		{
			System.out.printf("%s, voc� tem %d anos e voc� receber� o auxilio em seu valor normal!", nome, idade);
		}
		else if(idade >= 18 && sexo == 'M' && chefeFamilia == 'N')
		{
			System.out.printf("%s, voc� tem %d anos e voc� n�o se enquandra para receber o auxilio!", nome, idade);
		}else {
			System.out.printf("%s, voc� tem %d anos e menor de idade!", nome, idade);
		}
		
		
	}
	
}
