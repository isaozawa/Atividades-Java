package Operadores;

import java.util.Scanner;

public class Exercício1 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		float media, n1, n2, n3;
		System.out.println("Escreva a primeira nota: ");
		n1 = ler.nextFloat();
		System.out.println("Escreva a segunda nota: ");
		n2 = ler.nextFloat();
		System.out.println("Escreva a terceira nota: ");
		n3 = ler.nextFloat();
		media = (n1*2 + n2*3 + n3*5)/10;
		System.out.println("A média é: ");
		System.out.println(media);
	}

}

