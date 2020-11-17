package Flow2;

import java.util.*;

/*As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, 
  e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia 
  o número de maçãs compradas, calcule e escreva o valor total da compra. */

public class Ex3 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int N;
		double preço;
		
		System.out.println("Quantas maçãs serão compradas? ");
		N = ler.nextInt();
		
		if (N>=12)
		{
			preço = N*0.25;
			System.out.println("O valor da compra é: R$ " + preço);			
		}
		
		else if (N<=0)
		{
			System.out.println("Número inválido");
		}
		
		else
		{
			preço = N*0.30;
			System.out.println("O valor da compra é: R$ " + preço);
		}
		
	}

}
