package projetinhoContaBancariaPOO;

public class ContaEmpresa extends ContaBancaria{

	//atributos
	private double limiteEmpresa;
	
	//construtor padr�o
	public ContaEmpresa() {
	}
	
	//construtor
	public ContaEmpresa(String nomeCliente, int numConta, double limiteEmpresa) {
		super(nomeCliente, numConta);
		this.limiteEmpresa = limiteEmpresa;
	}

	
	//m�todos getters and setters
	public double getLimiteEmpresa() {
		return limiteEmpresa;
	}

	public void setLimiteEmpresa(double limiteEmpresa) {
		this.limiteEmpresa = limiteEmpresa;
	}
	
	
	//m�todos criados
	public void emprestimoSalarial(double limiteEmpresa) {
	
		double porcentagemLimite = ((getSaldo() / 100) * 50); //calculando a porcentagem de 50% do saldo
		
		if (super.getSaldo() < porcentagemLimite) { //se o saldo/limite usado for menor que 50%
			super.credite(super.getSaldo() + (limiteEmpresa * 2)); 
			this.limiteEmpresa = 0;
		} else if (super.getSaldo() > porcentagemLimite) { //se o saldo/limite usado for maior que 50%
			System.out.println("N�o foi poss�vel conceder empr�stimo, pois, est� sendo usado mais que 50% do limite atual.");
		}
	}
	
	
	
	
}
