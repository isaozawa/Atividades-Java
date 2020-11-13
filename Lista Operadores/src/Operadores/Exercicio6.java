package Operadores;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int idade, dias, mes, ano;
		System.out.println("Qual sua idade em dias?");
		idade = ler.nextInt();
		ano = idade/365;
		mes = (idade%365)/30;
		dias = (idade%365)%30;
		System.out.println("Sua idade em anos é:");
		System.out.println(ano);
		System.out.println("Sua idade em meses é:");
		System.out.println(mes);
		System.out.println("Sua idade em dias é:");
		System.out.println(dias);		
				
	}
}
