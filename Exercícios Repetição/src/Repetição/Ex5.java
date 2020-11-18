package Repetição;

import java.util.*;

/*Escrever um programa que receba vários números inteiros no teclado. E no
  final imprimir a média dos números múltiplos de 3. Para sair digitar
  0(zero).(DO...WHILE)*/

public class Ex5 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int n, multiplos=0;
		float media=0, soma=0;
		
		do
		{
			System.out.println("Escreva um número: ");
			n = ler.nextInt();
			
			if (n%3==0 && n!=0)
			{
				multiplos = multiplos + 1;
				soma = soma +n;
				media = (soma/multiplos);
			}
		}
		while (n !=0);
		
		
		
		System.out.println("A média dos números multiplos de 3 é: " + media);
			
		
	}

}
