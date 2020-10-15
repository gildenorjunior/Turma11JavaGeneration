/*
 * 1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
 *  (getters) e modificadores (setters), e ainda o construtor padr�o e pelo menos mais duas op��es
 *   de construtores conforme sua percep��o. Atributos: String nome; String endere�o; String telefone; 
 */

package lista02Exercicos;

public class Pessoa {

	//atributos da classe pessoa
	private String nome;
	private String endereco;
	private String telefone;
	
	//construtor padr�o
	public Pessoa () {
		
	}
	
	//sobrecarga do construtor
	public Pessoa (String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
	//sobrecarga do construtor
	public Pessoa (String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	//getters e setters dos atributos da classe pessoa
	public String getNome() { 
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
