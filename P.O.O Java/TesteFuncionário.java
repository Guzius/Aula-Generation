package Exerc�cios;

public class TesteFuncion�rio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcion�rio[] lista = new Funcion�rio[3];
		
		lista[0] = new Funcion�rio("Avanir",29,"Chefa de cozinha",4000);
		lista[1] = new Funcion�rio("Jo�o",19,"Auxiliar administrativo",3500);
		lista[2] = new Funcion�rio("Everton",31,"T�cnico em T.I",3000);
		
		for(Funcion�rio roda:lista)
		{
			roda.imprimirInfo();
		}
	}

}
