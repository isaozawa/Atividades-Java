package Repeti��o;

import java.util.*;

/*Fa�a um programa que pegue um n�mero do teclado e calcule a soma de
  todos os n�meros de 1 at� ele. Ex.: o usu�rio entra 7, o programa vai mostrar
  28, pois 1+2+3+4+5+6+7=28. .(DO...WHILE)*/

public class Ex11 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int n, x, soma=0;
		
		System.out.println("Digite um numero: ");
		n = ler.nextInt();
		
		do
		{
			for (x=1; x<=n; x++)
			{
				soma = soma + x;
			}
		}
		while (x<n);
		
		System.out.println(soma);
	}

}
