package Exerc�cios;

public class Pregui�a extends Animal{
	
	private String subir;
	
	public Pregui�a(String nome, String idade, String som, String subir)
	{
		super(nome, idade, som);
		this.subir = subir;
	}

	public String getSubir() {
		return subir;
	}

	public void setSubir(String subir) {
		this.subir = subir;
	}
}
