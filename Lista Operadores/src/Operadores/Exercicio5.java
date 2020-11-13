package Operadores;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int dia, mes, ano, res;
		System.out.println("Quantos anos você tem?");
		ano = ler.nextInt();
		System.out.println("Quantos meses?");
		mes = ler.nextInt();
		System.out.println("Quantos dias?");
		dia = ler.nextInt();
		res = ano*365 + mes*30 + dia;
		System.out.println("Sua idade em dias é: ");
		System.out.println(res);
	}

}
