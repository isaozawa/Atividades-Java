package Exercícios;

import java.util.*;

public class Ex6 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int idade;
		
		System.out.println("Insira a idade do nadador; ");
		idade = ler.nextInt();
		
		if (idade<5)
		{
			System.out.println("\nSem categoria");
		}
		
		else if (idade>=5 && idade<=7)
		{
			System.out.println("\nInfantil A");
		}
		
		else if (idade>=8 && idade<=11)
		{
			System.out.println("\nInfantil B");
		}
		
		else if (idade>=12 && idade<=13)
		{
			System.out.println("\nJuvenil A");
		}
		
		else if (idade>=14 && idade<=17)
		{
			System.out.println("\nJuvenil B");
		}
		
		else 
		{
			System.out.println("\nAdultos");
		}
	}

}
