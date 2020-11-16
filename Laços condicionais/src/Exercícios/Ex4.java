package Exercícios;

import java.util.*;

public class Ex4 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int n;
		
		System.out.println("Insira um número inteiro: ");
		n = ler.nextInt();
		
		if (n%2 == 0)
		{
			System.out.println("O número é par.");
			
			if (n>=0)
			{
				System.out.println("O número é positivo.");
			}
			
			else if (n<0)
			{
				System.out.println("O número é negativo.");
			}
			
		}
		
		else
		{
			System.out.println("O número é ímpar.");
			if (n>=0)
			{
				System.out.println("O número é positivo.");
			}
			
			else if (n<0)
			{
				System.out.println("O número é negativo.");
		
			}

		}
	}
}
