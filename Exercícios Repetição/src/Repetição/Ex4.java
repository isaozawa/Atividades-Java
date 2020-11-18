package Repetição;

import java.util.*;

/*Crie um programa que leia um número do teclado até que encontre um
  número igual a zero. No final, mostre a soma dos números
  digitados.(DO...WHILE)*/

public class Ex4 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int n, soma=0;
		
		do
		{
			System.out.println("Digite um número");
			n = ler.nextInt();
			soma = soma +n;
		}
		while (n !=0);
		
		System.out.println("A soma dos números digitados é: " + soma);
			
	}

}
