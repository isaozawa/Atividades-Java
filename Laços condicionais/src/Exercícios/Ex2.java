package Exercícios;

import java.util.*;

public class Ex2 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		String C;
		double N, E, total;
		
		System.out.printf("Qual o código do operário? ");
		C = ler.next();
		
		System.out.printf("Número de horas trabalhados por esse operário: ");
		N = ler.nextDouble();
		
		if (N>50)
		{
			E = (N - 50)*20;
			total = 50*10 + E;
						
			System.out.printf("\nO salário total do operário %s é R$ %f e o salário excedente é R$ %f" , C , total, E);
		}
		
		else if (N<=0)
		{
			System.out.printf("\nNúmero inválido");
		}
		
		else
		{
			total = N*10;
			System.out.printf("\nO salário total do operário %s é R$ %f", C, total);
		}
		
	}

}
