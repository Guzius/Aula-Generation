package Exerc�cios;

import java.util.Scanner;

public class Exerc�cioFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,par = 0,impar = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<=10;x++)
		{
			System.out.println("\nEscreva os n�meros: ");
			x = leia.nextInt();
				if(x % 2 == 0)
				{
					par++;
				}
				else
				{
					impar++;
				}
		}
		System.out.printf("\nN�meros pares: %d",par);
		System.out.printf("\nN�meros �mpares: %d",impar);
	}

}
