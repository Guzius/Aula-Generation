package Exerc�cios;

import java.util.Scanner;

public class Exerc�cioDoWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("\nDigite um n�mero do teclado: ");
		num = leia.nextInt();
		
		do
		{
			soma = soma + num;
			System.out.printf("\nSeu n�mero: %d",num);
			System.out.printf("\nDigite um n�mero do teclado: ");
			num = leia.nextInt();
		}while(num!=0);
		
		System.out.printf("\nA soma desses n�meros �: %d", soma);
	}

}
