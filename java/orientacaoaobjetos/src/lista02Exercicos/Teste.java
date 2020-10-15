package lista02Exercicos;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Jo�o", "Rua A", "(11) 91234-9876"); //Buscando da sobrecarga do meu construtor padr�o onde pedi para passar todos os atributos da classe
		Pessoa pessoa2 = new Pessoa("Maria", "Rua B"); //Buscando da sobrecarga do meu construtor padr�o onde pedi para passar apenas dois atributos
		Pessoa pessoa3 = new Pessoa(); // Buscando no meu construtor padr�o que define sem passar nenhum atributo
		
		Pessoa fornecedor1 = new Fornecedor(); //buscando do construtor padr�o de Fornecedor onde permite vazio
		Fornecedor fornecedor2 = new Fornecedor("RN �gua Gal�es", "Rua Y", "(84) 94444-5555", 1000, 200); //herdando os atributos da classe Pessoa e buscando da sobrecarga do construtor  padr�o da classe Fornecedor, onde eu obrigo a preencher todos os atributos
		
		//Apenas pegando os valores j� contidos na instancia e apresentando na tela
		System.out.println("Apresentando a Pessoa 1 com os atributos j� definidos:");
		System.out.println("Nome: " + pessoa1.getNome());
		System.out.println("Endere�o: " + pessoa1.getEndereco());
		System.out.println("Telefone: " + pessoa1.getTelefone());
		
		//Modificando os valores dos atributos da instancia
		pessoa1.setNome("Jo�o P� de Feij�o");
		pessoa1.setEndereco("Rua ABC");
		pessoa1.setTelefone("(11) 99999-9999");
		System.out.println("\nApresentando a Pessoa 1 com os atributos modificados: ");
		System.out.println("Nome: " + pessoa1.getNome());
		System.out.println("Endere�o: " + pessoa1.getEndereco());
		System.out.println("Telefone: " + pessoa1.getTelefone());
		
		//Mostrando os atributos da pr�pria instancia e os herdados, sem modific�-los. 
		System.out.println("\nApresentando Fornecedor 1 com os atributos herdados pela classe m�e (Pessoa) e mostrando tamb�m os pr�prios da classe (Fornecedor):");
		System.out.println("Nome: " + fornecedor2.getNome());
		System.out.println("Endere�o: " + fornecedor2.getEndereco());
		System.out.println("Telefone: " + fornecedor2.getTelefone());
		System.out.println("Valor de Cr�dito: R$" + fornecedor2.getValorCredito());
		System.out.println("Valor da divida: R$" + fornecedor2.getValorDivida());
		System.out.println("Valor do saldo disponivel: R$" + fornecedor2.obterSaldo(1000, 200));
		
	}

}
