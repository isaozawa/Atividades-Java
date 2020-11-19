package VetorMatriz;

import java.util.*;

/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.*/

public class Ex2 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int [][] N1 = new int[4][6],N2 = new int[4][6], M1 = new int [4][6], M2 = new int[4][6];
		int l, c;
		
		for (l=0;l<4;l++)
		{
			for(c=0;c<6;c++)
			{
				System.out.println("Insira o valor de N1 [" + (l + 1)+"] [" + (c+1) + "]");
				N1[l][c] = ler.nextInt();
				System.out.println("Insira o valor de N2 [" + (l + 1)+"] [" + (c+1) + "]");
				N2[l][c] = ler.nextInt();
				M1[l][c] = N1[l][c] + N2[l][c];
				M2[l][c] = N1[l][c] - N2[l][c];
			}
		}
		System.out.println("Matriz soma M1: \n");
		for (l=0;l<4;l++)
		{
			for (c=0;c<6;c++)
			{
				System.out.print("[" + M1[l][c] + "]");
			}
			System.out.print("\n");
		}
		
		System.out.println("\nMatriz subtração M2: \n");
		for (l=0;l<4;l++)
		{
			for (c=0;c<6;c++)
			{
				System.out.print("[" + M2[l][c] + "]");
			}
			System.out.print("\n");
		}
	}

}
