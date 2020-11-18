package Repetição;

import java.util.*;

/*Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele
  por três (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o
  usuário digita 5, deveremos observar na tela a seguinte sequência: 5 15 45
  135. (WHILE)*/

public class Ex9 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int n, total=0;
				
		System.out.println("Digite um número");
		n = ler.nextInt();
		total = n;
		System.out.println("\n" + total);
		
		while (total<=100)
		{	
			
			if (total<=100)
			{
				total = total*3;
				System.out.println(total);
			}
			
			else
			{
				total=total*3;
				System.out.println(total);
			}
			
		}
	}

}
