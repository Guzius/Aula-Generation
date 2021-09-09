package Exerc�cios;

import java.text.NumberFormat;

public class Eletro {
	
	private String produto;
	private float pre�o;
	
	// m�todo construtor
	
	public Eletro(String produto,float pre�o)
	{
		this.produto = produto;
		this.pre�o = pre�o;
	}
	
	// declara��o dos demais m�todos da minha classe
	
	public void imprimirInfo()
	{
		System.out.println("\nSeu produto "+produto+" custa "+ this.formatarMoeda());
	}
	
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public float getPre�o() {
		return pre�o;
	}

	public void setPre�o(float pre�o) {
		this.pre�o = pre�o;
	}
	
	public void desconto(double percentual)
	{
		pre�o *= 1 - percentual/100;
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();//formata na moeda do pais
		nf.setMinimumFractionDigits(2);//indica a quantidade de d�gitos que ter�o depois da virgula
		String formatoMoeda = nf.format(pre�o);//formata��o de sa�da monet�ria
		return formatoMoeda;
	}


}
