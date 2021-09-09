package Exerc�cios;

public class Cliente {
	
	private String nome;
	private String endere�o;
	private String telefone;
	private int idade;
	
	// m�todo construtor
	
	public Cliente(String nome,String endere�o,String telefone,int idade)
	{
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone;
		this.idade = idade;
	}
	
	// declara��o dos demais m�todos da minha classe
	
	public void imprimirInfo()
	{
		System.out.println("\nCliente "+nome+" mora em: "
	+endere�o+", seu telefone �: "+telefone+" e sua idade: "+idade+" anos");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
