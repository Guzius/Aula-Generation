package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int int1, int2, int3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva o primeiro n�mero: ");
		int1 = leia.nextInt();
		System.out.println("\nEscreva o segundo n�mero: ");
		int2 = leia.nextInt();
		System.out.println("\nEscreva o terceiro n�mero: ");
		int3 = leia.nextInt();
		
		if(int1 > int2 && int1 > int3)
		{
			System.out.println("\nO maior n�mero: "+int1);
		}
		else if (int2 > int1 && int2 > int3)
		{
			System.out.println("\nO maior n�mero: "+int2);
		}
		else if (int3 > int1 && int3 > int2)
		{
			System.out.println("\nO maior n�mero: "+int3);
		}
		else
		{
			System.out.println("\nN�o h� um n�mero maior");
		}
	}

}
