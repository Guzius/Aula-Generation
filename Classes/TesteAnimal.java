package Exerc�cios;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro dog = new Cachorro("Jeff",5);
        Pregui�a lazy = new Pregui�a("Henrique",3);
        Cavalo horse = new Cavalo("Motaro",6);
        
        dog.acao();
        dog.som();
        lazy.acao();
        lazy.som();
        horse.acao();
        horse.som();
        
        System.out.println("\nO cachorro "+dog.nome+" tem "+dog.idade+" anos de idade");
        System.out.println("\nA pregui�a "+lazy.nome+" tem "+lazy.idade+" anos de idade");
        System.out.println("\nO cavalo "+horse.nome+" tem "+horse.idade+" anos de idade");
	}

}
