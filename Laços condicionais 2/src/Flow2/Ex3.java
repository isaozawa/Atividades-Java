package Flow2;

import java.util.*;

/*As ma��s custam R$ 0,30 cada se forem compradas menos do que uma d�zia, 
  e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia 
  o n�mero de ma��s compradas, calcule e escreva o valor total da compra. */

public class Ex3 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int N;
		double pre�o;
		
		System.out.println("Quantas ma��s ser�o compradas? ");
		N = ler.nextInt();
		
		if (N>=12)
		{
			pre�o = N*0.25;
			System.out.println("O valor da compra �: R$ " + pre�o);			
		}
		
		else if (N<=0)
		{
			System.out.println("N�mero inv�lido");
		}
		
		else
		{
			pre�o = N*0.30;
			System.out.println("O valor da compra �: R$ " + pre�o);
		}
		
	}

}
