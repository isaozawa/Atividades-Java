package Flow2;

import java.util.*;

/* Escreva um programa para ler 3 valores inteiros e escrever o maior deles. 
   Considere que o usu�rio n�o informar� valores iguais.*/

public class Ex6 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int n1, n2, n3, maior = 0;
		
		System.out.println("Escreva o primeiro n�mero: ");
		n1 = ler.nextInt();
			
		System.out.println("Escreva o segundo n�mero: ");
		n2 = ler.nextInt();
		
		System.out.println("Escreva o terceiro n�mero: ");
		n3 = ler.nextInt();
		
		if (n1==n2 || n1==n3 || n2==n3)
		{
			System.out.println("Insira n�meros diferentes!");
			
			return;
		}
			
		else if (n1>n2 && n1>n3)
		{
			maior = n1;
		}
		else if (n2>n1 && n2>n3)
		{
			maior = n2;
		}
		
		else
		{
			maior = n3;
		}
		
		System.out.println("O maior n�mero �: " + maior);
	}
	

}
