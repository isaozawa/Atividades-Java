package Repeti��o;

import java.util.*;

/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/

public class Ex2 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int n, x, par = 0, impar = 0;
		
		for (n=1;n<=10;n++)
		{
			System.out.println("Escreva um n�mero");
			x = ler.nextInt();
			
			if (x%2==0)
			{
				par = par+1;
			}
			else
			{
				impar = impar+1;
			}
		}
		System.out.println("A quantidade de n�meros pares �: " + par + " e de n�meros �mpares �: " + impar);
	}

}
