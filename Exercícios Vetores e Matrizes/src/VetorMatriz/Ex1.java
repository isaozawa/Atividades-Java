package VetorMatriz;

import java.util.*;

/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
  Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
  A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize 
  e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.*/

public class Ex1 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int [] lancamento = new int [10];
		int maior = 0, qtdemaior = 0;
		double soma = 0, media;
		
		for (int i=0; i<10; i++)
		{
			System.out.println("Escreva o valor do lan�amento: ");
			lancamento[i] = ler.nextInt();
			soma = soma + lancamento[i];
			if (lancamento[i]>maior)
			{
				maior = lancamento[i];
				
			}
			
		}
		
		for (int i=0; i<10; i++)
		{
			System.out.println("Lan�amento " + (i+1) + ": " + lancamento[i]);
			if (lancamento[i] == maior)
			{
				qtdemaior = qtdemaior +1;
			}
		}
		media = soma/10;
		System.out.println("A m�dia dos lan�amentos � " + media);
		System.out.println("As maior ocorr�ncia foi: " + maior + " aparecendo " + qtdemaior + " vezes.");
	}

}
