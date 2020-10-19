package projetinhoContaBancariaPOO;

public abstract class ContaBancaria {

	// atributos da classe
		private String nomeCliente;
		private int numConta;
		private double saldo;

		// construtor padr�o
		public ContaBancaria() {

		}

		// construtor sobrecarga
		public ContaBancaria(String nomeCliente, int numConta) {
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

		public int getNumConta() {
			return numConta;
		}

		public void setNumConta(int numConta) {
			this.numConta = numConta;
		}

		public double getSaldo() {
			return saldo;
		}

		// m�todo de Saque
		public boolean debite(double valorDebito) {

			if (this.saldo > 0 && valorDebito <= this.saldo) {
				if(((saldo - valorDebito) >= 0)) {
					this.saldo= (this.getSaldo() - valorDebito);
					return true;
				}
			} 
			return false;
		}

		// m�todo de Dep�sito
		void credite(double valorCredito) {
			this.saldo += valorCredito;
		}

		@Override
		public String toString() {
			return "ContaBancaria [nomeCliente: " + nomeCliente + ", numConta: " + numConta + ", saldo: " + saldo + "]";
		}

	
}
