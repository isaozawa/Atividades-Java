package Operadores;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int tempo, horas, minutos, segundos;
		System.out.println("Insira o tempo de duração do evento da fábrica em segundos: ");
		tempo = ler.nextInt();
		horas = tempo/3600;
		minutos = (tempo%3600)/60;
		segundos = (tempo%60)%60;
		System.out.println("O tempo de duração em horas é:");
		System.out.println(horas);
		System.out.println("O tempo de duração em minutos é:");
		System.out.println(minutos);
		System.out.println("O tempo de duração em segundos é:");
		System.out.println(segundos);
	}

}
