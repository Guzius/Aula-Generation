package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, raiz, quad;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva um n�mero ");
		num = leia.nextInt();
		
		if (num % 2 == 0)
		{
			raiz = (int) Math.sqrt(num);
			System.out.println("\nN�mero par: "+num);
			System.out.println("\nSua raiz quadrada �: "+raiz);
		}
		else
		{
			quad = (int) Math.pow(num, 2);
			System.out.println("\nN�mero �mpar: "+num);
			System.out.println("\nEste n�mero elevado ao quadrado �: "+quad);
		}
	}

}
