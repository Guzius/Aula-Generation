package Exerc�cios;

import java.util.Scanner;

public class Exerc�cioWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade,x=0,sexo,psi,mais = 0,menos = 0,pc = 0,ml = 0,ha = 0,oc = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva a sua idade: ");
		idade = leia.nextInt();
		System.out.println("\nDigite 1 se seu sexo for feminino, 2 se for masculino ou 3 se for outro: ");
		sexo = leia.nextInt();
		System.out.println("\nDigite o n�mero correspondente as suas caracter�sticas psicol�gicas:\n1 = Calme\t2 = Nervose\t3 = Agressive");
		psi = leia.nextInt();
		
		while(x<150)
		{
			x++;
			if(psi == 1)
			{
				pc++;
			}
			else if(psi > 3)
			{
				System.out.println("\nErrado!");
			}
				if(sexo == 1 && psi == 2)
				{
					ml++;
				}
				else if(sexo == 2 && psi == 3)
				{
					ha++;
				}
				else if(sexo == 3 && psi == 1)
				{
					oc++;
				}
				else if(sexo > 3)
				{
					System.out.println("\nErrado!");
				}
					if(psi == 2 && idade>40)
					{
						mais++;
					}
					else if(psi == 1 && idade<18)
					{
						menos++;
					}
			System.out.println("\nEscreva a sua idade: ");
			idade = leia.nextInt();
			System.out.println("\nDigite 1 se seu sexo for feminino, 2 se for masculino ou 3 se for outro: ");
			sexo = leia.nextInt();
			System.out.println("\nDigite o n�mero correspondente as suas caracter�sticas psicol�gicas:\n1 = Calme\t2 = Nervose\t3 = Agressive");
			psi = leia.nextInt();
		}
		System.out.printf("\nN�mero de pessoas calmas: %d",pc);
		System.out.printf("\nN�mero de mulheres nervosas: %d",ml);
		System.out.printf("\nN�mero de homens agressivos: %d",ha);
		System.out.printf("\nN�mero de outros calmos: %d",oc);
		System.out.printf("\nN�mero de pessoas nervosas com mais de 40 anos: %d",mais);
		System.out.printf("\nN�mero de pessoas calmas com menos de 18 anos: %d",menos);
	}

}
