package VetorMatriz;

import java.util.*;

/*Um dado é lançado 10 vezes e o valor correspondente é anotado. 
  Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
  A seguir determine e imprima a média aritmética dos lançamentos, contabilize 
  e apresente também quantas foram as ocorrências da maior pontuação.*/

public class Ex1 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int [] lancamento = new int [10];
		int maior = 0, qtdemaior = 0;
		double soma = 0, media;
		
		for (int i=0; i<10; i++)
		{
			System.out.println("Escreva o valor do lançamento: ");
			lancamento[i] = ler.nextInt();
			soma = soma + lancamento[i];
			if (lancamento[i]>maior)
			{
				maior = lancamento[i];
				
			}
			
		}
		
		for (int i=0; i<10; i++)
		{
			System.out.println("Lançamento " + (i+1) + ": " + lancamento[i]);
			if (lancamento[i] == maior)
			{
				qtdemaior = qtdemaior +1;
			}
		}
		media = soma/10;
		System.out.println("A média dos lançamentos é " + media);
		System.out.println("As maior ocorrência foi: " + maior + " aparecendo " + qtdemaior + " vezes.");
	}

}
