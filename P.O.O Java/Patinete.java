package Exerc�cios;

public class Patinete {

	private String usu�rio;
	private String tipo;
	private int tamanho;
	private String cor;
	
	// m�todo construtor
	
	public Patinete(String usu�rio, String tipo, int tamanho, String cor)
	{
		this.usu�rio = usu�rio;
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.cor = cor;
	}
	
	// declara��o dos demais m�todos da minha classe
	
	public void imprimirInfo()
	{
		System.out.println("\n"+usu�rio+"\nPatinete:"+tipo+"\nTamanho:"+tamanho+"\nCor:"+cor);
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getUsu�rio() {
		return usu�rio;
	}

	public void setUsu�rio(String usu�rio) {
		this.usu�rio = usu�rio;
	}
}
