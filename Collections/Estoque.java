package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Estoque {

	public static void main(String[] args) {
		
		List <String> produtos = new ArrayList<String>();
		
		String produtosrepetidos = "Caf�";
		
		produtos.add("Arroz");
		produtos.add("Feij�o");
		produtos.add("Caf�");
		produtos.add("Macarr�o");
		produtos.add("Farinha de Trigo");
		produtos.add("Ovo");
		produtos.add("Cebola");
		produtos.add("Alho");
		
		if(produtos.isEmpty())
		{
			System.out.println("O estoque est� vazio");
		}
		else
		{
			System.out.println("Lista completa:");
			System.out.println("\n"+produtos+"\n");
			System.out.println("Lista com produtos removidos:");
			produtos.remove("Arroz");
			produtos.remove("Feij�o");
			produtos.remove("Ovo");
			System.out.println("\n"+produtos+"\n");
			System.out.println("Lista vazia:");
			produtos.clear();
			System.out.println("\n"+produtos+"\n");
			produtos.add("Arroz");
			produtos.add("Feij�o");
			produtos.add("Caf�");
			produtos.add("Macarr�o");
			produtos.add("Farinha de Trigo");
			produtos.add("Ovo");
			produtos.add("Cebola");
			System.out.println("Lista nova:");
			List <String> produtos2 = Arrays.asList
			("Caf�","Iogurte","Manteiga","Presunto","Queijo","Geleia","Bolo","P�o de Forma");
			produtos.addAll(produtos2);
			System.out.println("\n"+produtos2+"\n");
			for(String string : produtos) {
				if(string.equalsIgnoreCase(produtosrepetidos));
				{
					produtos.remove("Caf�");
				}
			System.out.println("Nova lista completa:");
			System.out.println("\n"+produtos+"\n");
		}
	}
	}
}