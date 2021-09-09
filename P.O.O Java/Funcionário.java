package Exerc�cios;

import java.text.NumberFormat;

public class Funcion�rio {
	
	private String nome;
	private int idade;
	private String fun��o;
	private float sal�rio;
	
	// m�todo construtor
	
	public Funcion�rio(String nome, int idade, String fun��o, float sal�rio)
	{
		this.nome = nome;
		this.idade = idade;
		this.fun��o = fun��o;
		this.sal�rio = sal�rio;
	}
	
	// declara��o dos demais m�todos da minha classe
	
	public void imprimirInfo()
	{
		System.out.println("\nO(a) funcion�rio(a) "+nome+", de "+idade+" anos, trabalha como "+fun��o+
		" e recebe um sal�rio de " +this.formatarMoeda());
	}
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();//formata na moeda do pais
		nf.setMinimumFractionDigits(2);//indica a quantidade de d�gitos que ter�o depois da virgula
		String formatoMoeda = nf.format(sal�rio);//formata��o de sa�da monet�ria
		return formatoMoeda;
	}

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

	public String getFun��o() {
		return fun��o;
	}

	public void setFun��o(String fun��o) {
		this.fun��o = fun��o;
	}

	public float getSal�rio() {
		return sal�rio;
	}

	public void setSal�rio(float sal�rio) {
		this.sal�rio = sal�rio;
	}
}
