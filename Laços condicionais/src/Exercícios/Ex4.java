package Exerc�cios;

import java.util.*;

public class Ex4 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int n;
		
		System.out.println("Insira um n�mero inteiro: ");
		n = ler.nextInt();
		
		if (n%2 == 0)
		{
			System.out.println("O n�mero � par.");
			
			if (n>=0)
			{
				System.out.println("O n�mero � positivo.");
			}
			
			else if (n<0)
			{
				System.out.println("O n�mero � negativo.");
			}
			
		}
		
		else
		{
			System.out.println("O n�mero � �mpar.");
			if (n>=0)
			{
				System.out.println("O n�mero � positivo.");
			}
			
			else if (n<0)
			{
				System.out.println("O n�mero � negativo.");
		
			}

		}
	}
}
