package lista03ExerciciosPOO;

public abstract class Animal { //abstract porque n�o posso instanciar um objeto "animal" apenas, ele tem que ser um tipo especifico ex: cachorro.. 

	//Atributos
	private String nome;
	private int idade;
	
	//construtor padr�o
	public Animal () {
		
	}
	
	//sobrecarga do construtor
	public Animal (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	//m�todos getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//m�todos criados
	public abstract void emitirSom(); //m�todo abstrato, pois nas outras classes eles podem chamar esse m�todo e modificar ele da forma que for necess�rio
	
	
	
	
}
