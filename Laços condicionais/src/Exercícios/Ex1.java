package Exerc�cios;

import java.util.*;

public class Ex1 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		double P, E, M;
		
		System.out.printf("Entre com o peso do tomate em quilos: ");
		P = ler.nextDouble();
		
		if (P > 50)
		{
			E = P - 50;
			M = 4 * E;
						
			System.out.printf("\n O peso excedente �: %s e o valor da multa �: %s", E, M);
			
		
		}
		
		else if (P <= 0)
		{
			System.out.printf("\nPeso inv�lido");
		}
		
		else
		{
			System.out.printf("\nN�o h� peso excedente.");
		}
			
		

		
	}

}
