package Repeti��o;

import java.util.*;

/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
  final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
  0(zero).(DO...WHILE)*/

public class Ex5 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int n, multiplos=0;
		float media=0, soma=0;
		
		do
		{
			System.out.println("Escreva um n�mero: ");
			n = ler.nextInt();
			
			if (n%3==0 && n!=0)
			{
				multiplos = multiplos + 1;
				soma = soma +n;
				media = (soma/multiplos);
			}
		}
		while (n !=0);
		
		
		
		System.out.println("A m�dia dos n�meros multiplos de 3 �: " + media);
			
		
	}

}
