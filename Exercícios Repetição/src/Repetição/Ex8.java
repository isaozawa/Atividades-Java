package Repetição;

import java.util.*;

/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
  apresente no final o total do somatório, a média e o total de valores lidos. O
  programa deve fazer as leituras dos valores enquanto o usuário estiver
  fornecendo valores positivos. Ou seja, o programa deve parar quando o
  usuário fornecer um valor negativo. (WHILE)*/

public class Ex8 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		double x=0, soma=0, qtde=0, media=0;
		
		while (x>=0)
		{
			System.out.println("Digite um valor: ");
			x = ler.nextDouble();
			
			if (x>=0)
			{
				qtde = qtde + 1;
				soma = soma + x;
			}
			
		}
		
		media = soma/qtde;
		
		System.out.println("O somatório dos números é: " + soma + ", a média é: " + media + 
				           " e o total de valores lidos é: " + qtde);
	}

}
