/* Implemente a classe Operario como subclasse da classe Pessoa.
 * Um determinado oper�rio tem como atributos da classe Pessoa e tamb�m os atributos
 * pr�prios como valorProducao (que corresponde ao valor monet�rio dos artigos efetivamente produzidos pelo oper�rio) 
 * e comissao (que corresponde � porcentagem do valorProducao que ser� adicionado ao vencimento base do oper�rio). 
 */

package lista02ExercicosPOO;

public class Operario extends Pessoa{

	private int valorProducao; //(que corresponde ao valor monet�rio dos artigos efetivamente produzidos pelo oper�rio)
	private int comissao; //(que corresponde � porcentagem do valorProducao que ser� adicionado ao vencimento base do oper�rio)
	
	//construtor padr�o vazio
	public Operario() {
	}
	
	//sobrecarga do construtor
	public Operario(String nome, String endereco, String telefone, int valorProducao, int comissao) {
		super(nome, endereco, telefone);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	//getters and setter
	public int getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(int valorProducao) {
		this.valorProducao = valorProducao;
	}

	public int getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}
	
	
}
