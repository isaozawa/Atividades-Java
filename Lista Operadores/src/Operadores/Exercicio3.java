package Operadores;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int A, B, C, D, R, S;
		System.out.println("Insira o número A: ");
		A = ler.nextInt();
		System.out.println("Insira o número B: ");
		B = ler.nextInt();
		System.out.println("Insira o número C: ");
		C = ler.nextInt();
		R = (int) Math.pow((A+B), 2);
		S = (int) Math.pow((B+C), 2);
		D = (R+S)/2;
		System.out.println("O valor de D é: ");
		System.out.println(D);
		
	}

}
