package Exerc�cios;

import java.util.*;

import java.math.*;

public class Ex5 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		double i;
		
		System.out.println("Insira o �ndice de polui��o: ");
		i = ler.nextDouble();
		
		if (i < 0.3)
		{
			System.out.println("O �ndice de polui��o est� aceit�vel!");
		}
		
		else if (i>=0.3 && i<0.4)
		{
			System.out.println("1� grupo deve suspender as atividades!");
		}
		
		else if (i >= 0.4 && i<0.5)
		{
			System.out.println("1� e 2� grupo devem suspender as atividades!");
		}
		
		else
		{
			System.out.println("Todos os grupos devem suspender suas atividades!");
		}
;	}

}
