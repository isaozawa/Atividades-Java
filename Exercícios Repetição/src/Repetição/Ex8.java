package Repeti��o;

import java.util.*;

/*Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e
  apresente no final o total do somat�rio, a m�dia e o total de valores lidos. O
  programa deve fazer as leituras dos valores enquanto o usu�rio estiver
  fornecendo valores positivos. Ou seja, o programa deve parar quando o
  usu�rio fornecer um valor negativo. (WHILE)*/

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
		
		System.out.println("O somat�rio dos n�meros �: " + soma + ", a m�dia �: " + media + 
				           " e o total de valores lidos �: " + qtde);
	}

}
