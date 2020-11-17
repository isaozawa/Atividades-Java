package Flow2;

import java.util.*;
import java.math.*;

/*Escreva um programa para ler 2 valores (considere que não serão informados valores iguais)
  e escrever o maior deles.*/

public class Ex1 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		double n1, n2;
		
		System.out.println("Escreva o primeiro valor: ");
		n1 = ler.nextDouble();
		
		System.out.println("Escreva o segundo valor: ");
		n2 = ler.nextDouble();
		
		if (n1 == n2)
		{
			System.out.println("\nValores inválidos, escreva números diferentes.");
		}
		
		else
		{
			System.out.println(Math.max(n1,n2));
		}
		
	}

}
