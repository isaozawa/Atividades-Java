package Operadores;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int tempo, horas, minutos, segundos;
		System.out.println("Insira o tempo de dura��o do evento da f�brica em segundos: ");
		tempo = ler.nextInt();
		horas = tempo/3600;
		minutos = (tempo%3600)/60;
		segundos = (tempo%60)%60;
		System.out.println("O tempo de dura��o em horas �:");
		System.out.println(horas);
		System.out.println("O tempo de dura��o em minutos �:");
		System.out.println(minutos);
		System.out.println("O tempo de dura��o em segundos �:");
		System.out.println(segundos);
	}

}
