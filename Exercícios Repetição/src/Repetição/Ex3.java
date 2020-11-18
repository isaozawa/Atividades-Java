package Repetição;

import java.util.*;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
  21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
  idade for =-99. (WHILE)*/

public class Ex3 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int idade=0, menor=0, maior=0;
		
		while (idade != -99)
		{
			System.out.println("Escreva a idade");
			idade= ler.nextInt();
			if (idade<21 && idade>0)
			{
				menor = menor +1;
			}
			else if (idade>50)
			{
				maior = maior +1;
			}
		}
		System.out.println("O total de pessoas com menos de 21 anos é " + menor +
			           	   " e o total de pessoas com mais de 50 anos é "+ maior);
	}

}
