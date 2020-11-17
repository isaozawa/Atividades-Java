package Flow2;

import java.util.*;

/*Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm). 
 *Calcular e imprimir o seguinte:

 − Se o número de lados for igual a 3 escrever TRIANGULO e o valor da área 
 − Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área. 
 − Se o número de lados for igual a 5 escrever PENTAGONO. */

public class Ex4 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int n;
		double L1, L2;
		
		System.out.println("Quantos lados tem o polígono? ");
		n = ler.nextInt();
		
		if (n == 3)
		{
			System.out.println("\nTRIÂNGULO \nQual a medida da base em cm? ");
			L1 = ler.nextDouble();
			
			System.out.println("\nQual a medida da altura em cm? ");
			L2 = ler.nextDouble();
			
			System.out.println("A área é: " + (L1*L2)/2 + "cm².");			
		}
		
		else if (n == 4)
		{
			System.out.println("\nQUADRADO \nQual a medida da base em cm? ");
			L1 = ler.nextDouble();
			
			System.out.println("\nQual a medida da altura em cm? ");
			L2 = ler.nextDouble();
			
			System.out.println("A área é: " + (L1*L2) + "cm².");
		}
		
		else if (n == 5)
		{
			System.out.println("\nPENTÁGONO");
		}
		
		else 
		{
			System.out.println("\nNúmero inválido!");
		}
	}

}
