package projetinhoContaBancariaPOO;

public class ContaCorrente extends ContaBancaria{

	//atributos
	private int talonario;
		
	
	//construtor padr�o
	public ContaCorrente() {
	}
	
	//construtores
	public ContaCorrente(String nomeCliente, int numConta, int talonario) {
		super(nomeCliente, numConta);
		this.talonario = talonario;
	}

	//m�todos getters and setters
	public int getTalonario() {
		return talonario;
	}

	public void setTalonario(int talonario) {
		this.talonario = talonario;
	}
		
	//m�todo criado
	public void emiteTalonario() {
		talonario++;
	}

	@Override
	public String toString() {
		return "ContaCorrente [Talonario: " + talonario + ", Nome Cliente: " + getNomeCliente() + ", Num Conta: " + getNumConta() + ", Saldo: " + getSaldo() + "]";
	}

	
	
	
	
	
	

	
	
	
}
