package Exercícios;

import java.util.*;

public class Ex7 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		double b, a, area;
		
		System.out.println("Insira a base do triângulo: ");
		b = ler.nextInt();
		
		System.out.println("Insira a altura do triângulo: ");
		a = ler.nextInt();
		
		if (b<=0 || a<=0)
		{
			System.out.println("Valores inválidos");
		}
		
		else
		{
			area = (b*a)/2;
			System.out.println("A área do triângulo é: " + area);
		}
	}

}
