package Exerc�cios;

public class TesteAvi�o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Avi�o[] lista = new Avi�o[3];
		
		lista[0] = new Avi�o("GOL","Piper PA-31",76.5f,564);
		lista[1] = new Avi�o("Boeing","Metro II",75,375);
		lista[2] = new Avi�o("Embraer","Beechcraft King Air",75,123);
		
		for(Avi�o roda:lista)
		{
			roda.imprimirInfo();
		}
	}

}
