package exerciciosLoianePOO;

public class ContaBancaria {

	// atributos da classe
	private String nomeCliente;
	private String numConta;
	private double saldo;

	// construtor padr�o
	public ContaBancaria() {

	}

	// construtor sobrecarga
	public ContaBancaria(String nomeCliente, String numConta) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
	}

	// m�todos getters and setters
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// m�todo de Saque
	public boolean sacar(double valorSaque) {

		if (this.saldo > 0 && valorSaque <= this.saldo) {
			if(((saldo - valorSaque) >= 0)) {
				this.saldo= (this.getSaldo() - valorSaque);
				return true;
			}
		} 
		return false;
	}

	// m�todo de Dep�sito
	void depositar(double valorDesposito) {
		this.saldo += valorDesposito;
	}

	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente: " + nomeCliente + ", numConta: " + numConta + ", saldo: " + saldo + "]";
	}

	
	
}
