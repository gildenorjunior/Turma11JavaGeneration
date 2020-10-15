/*2. Considere, como subclasse da classe Pessoa (desenvolvida no exerc�cio anterior) a classe Fornecedor.
 *  Considere que cada inst�ncia da classe Fornecedor tem, para al�m dos atributos que caracterizam a classe Pessoa,
 *  os atributos valorCredito (correspondente ao cr�dito m�ximo atribu�do ao fornecedor)
 *  e valorDivida (montante da d�vida para com o fornecedor). Implemente na classe Fornecedor,
 *  para al�m dos usuais m�todos seletores e modificadores, um m�todo obterSaldo() que devolve a 
 *  diferen�a entre os valores dos atributos valorCredito e valorDivida.
 *  Depois de implementada a classe Fornecedor, crie um programa de teste adequado que lhe permita verificar
 *  o funcionamento dos m�todos implementados na classe Fornecedor e os herdados da classe Pessoa. 
 */

package lista02Exercicos;

public class Fornecedor extends Pessoa {
	
	private int valorCredito; //correspondente ao cr�dito m�ximo atribu�do ao fornecedor
	private int valorDivida; //montante da d�vida para com o fornecedor
	
	//construtor padr�o
	public Fornecedor() {
		
	}
	
	//sobrecarga do construtor padr�o
	public Fornecedor (String nome, String endereco, String telefone, int valorCredito, int valorDivida) {
		super(nome, endereco, telefone); //puxando da super classe Pessoa os atributos dela e atribuindo a classe Filha Fornecedor
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	//getters and setters
	public int getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(int valorCredito) {
		this.valorCredito = valorCredito;
	}

	public int getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(int valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public int obterSaldo(int valorCredito, int valorDivida) {
		return this.valorCredito - this.valorDivida;
	}
	
}
