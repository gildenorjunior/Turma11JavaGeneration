package lista01;

import java.util.Scanner;

public class Lista01Exercicio08 {

	public static void main(String[] args) {
		
		/*
		 * O custo ao consumidor de um carro novo � a soma do custo 
		 * de f�brica com a percentagem do distribuidor e dos impostos 
		 * (aplicados ao custo de f�brica). Supondo que a percentagem 
		 * do distribuidor seja de 28% e os impostos de 45%, escrever 
		 * um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor.  
		 * custo consumidor = custo de fabrica + porcentagem distribuidor + impostos
		 */
		
		Scanner leia = new Scanner(System.in);
		
		double porcentagemDistribuidor = 0.28, impostos = 0.45,
		custoFabrica = 0, custoConsumidor = 0;
		
		System.out.print("Qual foi o custo de f�brica do veiculo? ");
		custoFabrica = leia.nextDouble();
		
		custoConsumidor = (custoFabrica + (porcentagemDistribuidor * custoFabrica) + (impostos * custoFabrica));
		
		System.out.println("O custo do seu carro novo foi de: " + custoConsumidor);

	}

}
