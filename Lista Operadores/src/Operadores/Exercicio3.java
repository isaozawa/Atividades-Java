package Operadores;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int A, B, C, D, R, S;
		System.out.println("Insira o n�mero A: ");
		A = ler.nextInt();
		System.out.println("Insira o n�mero B: ");
		B = ler.nextInt();
		System.out.println("Insira o n�mero C: ");
		C = ler.nextInt();
		R = (int) Math.pow((A+B), 2);
		S = (int) Math.pow((B+C), 2);
		D = (R+S)/2;
		System.out.println("O valor de D �: ");
		System.out.println(D);
		
	}

}
