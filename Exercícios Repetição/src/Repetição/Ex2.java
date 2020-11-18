package Repetição;

import java.util.*;

/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

public class Ex2 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int n, x, par = 0, impar = 0;
		
		for (n=1;n<=10;n++)
		{
			System.out.println("Escreva um número");
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
		System.out.println("A quantidade de números pares é: " + par + " e de números ímpares é: " + impar);
	}

}
