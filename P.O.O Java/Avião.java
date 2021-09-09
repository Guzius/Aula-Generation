package Exerc�cios;

public class Avi�o {
	
	private String marca;
	private String tipo;
	private float tamanho;
	private int assentos;
	
	// m�todo construtor
	
	public Avi�o(String marca,String tipo,float tamanho,int assentos)
	{
		this.marca = marca;
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.assentos = assentos;
	}
	
	// declara��o dos demais m�todos da minha classe
	
	public void imprimirInfo()
	{
		System.out.println("\nUm avi�o da marca "+marca+" do tipo "+tipo+" tem "+tamanho+" "
		+ "metros e pode portar "+assentos+" assentos");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	
}
