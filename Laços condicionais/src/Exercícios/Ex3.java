package Exercícios;

import java.util.*;

import java.math.*;

public class Ex3 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		double n1, n2, n3, n4, q1, q2, q3, q4;
		
		System.out.println("Escreva o primeiro valor: ");
		n1 = ler.nextDouble();
		
		System.out.println("Escreva o segundo valor: ");
		n2 = ler.nextDouble();
		
		System.out.println("Escreva o terceiro valor: ");
		n3 = ler.nextDouble();
		
		System.out.println("Escreva o quarto valor: ");
		n4 = ler.nextDouble();
		
		q1 = Math.pow(n1,2);
		q2 = Math.pow(n2,2);
		q3 = Math.pow(n3,2);
		q4 = Math.pow(n4,2);
		
		if (q3 >=100)
		{
			System.out.println(q3);
		}
		
		else
		{
			System.out.printf("%f ao quadrado é igual a %f; \n%f ao quadrado é igual a %f; \n%f ao quadrado é igual a %f "
					+ "\n%f ao quadrado é igual a %f", n1, q1, n2, q2, n3, q3, n4, q4);
		}
		
		
	}

}
