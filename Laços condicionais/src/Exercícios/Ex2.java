package Exerc�cios;

import java.util.*;

public class Ex2 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		String C;
		double N, E, total;
		
		System.out.printf("Qual o c�digo do oper�rio? ");
		C = ler.next();
		
		System.out.printf("N�mero de horas trabalhados por esse oper�rio: ");
		N = ler.nextDouble();
		
		if (N>50)
		{
			E = (N - 50)*20;
			total = 50*10 + E;
						
			System.out.printf("\nO sal�rio total do oper�rio %s � R$ %f e o sal�rio excedente � R$ %f" , C , total, E);
		}
		
		else if (N<=0)
		{
			System.out.printf("\nN�mero inv�lido");
		}
		
		else
		{
			total = N*10;
			System.out.printf("\nO sal�rio total do oper�rio %s � R$ %f", C, total);
		}
		
	}

}
