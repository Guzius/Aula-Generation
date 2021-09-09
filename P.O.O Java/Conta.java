package Exerc�cios;

public class Conta {
	
	private String nome;
	private String banco;
	private String tipo;
	private int ag�ncia;
	private int n�mero;
	
	// m�todo construtor
	
	public Conta(String nome, String banco, String tipo, int ag�ncia, int n�mero)
	{
		this.nome = nome;
		this.banco = banco;
		this.tipo = tipo;
		this.ag�ncia = ag�ncia;
		this.n�mero = n�mero;
	}
	
	// declara��o dos demais m�todos da minha classe
	
	public void imprimirInfo()
	{
		System.out.println("\nNome: "+nome+"\nBanco: "+banco+"\nTipo: "+tipo+"\nAg�ncia: "
		+ag�ncia+"\nN�mero: "+n�mero);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getAg�ncia() {
		return ag�ncia;
	}

	public void setAg�ncia(int ag�ncia) {
		this.ag�ncia = ag�ncia;
	}

	public int getN�mero() {
		return n�mero;
	}

	public void setN�mero(int n�mero) {
		this.n�mero = n�mero;
	}
}
