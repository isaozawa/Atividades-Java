package Exercícios;

import java.util.*;

public class Ex8 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		double N;
		
		System.out.println("Insira um valor: ");
		N = ler.nextDouble();
		
		if (N>100)
		{
			System.out.println("\n" + N);
		}
		
		else
		{
			System.out.println("\n0");
		}
	}

}
