package Exerc�cios;

public class Cavalo extends Animal{
	
	public Cavalo(String nome, int idade)
	{
		super(nome, idade);
	}
	public void acao() {
		System.out.println("\nO cavalo est� correndo");
	}
	public void som() {
		System.out.println("\nHiin in in hinir");
	}
}
