package Operadores;

import java.util.Scanner;

public class Exerc�cio2 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		double fabrica, consumidor;
		System.out.println("Qual � o custo de f�brica?");
		fabrica = ler.nextDouble();
		consumidor = fabrica + (fabrica*0.28) +(fabrica*0.45);
		System.out.println("O custo ao consumidor �: ");
		System.out.println(consumidor);
	}
	

}
