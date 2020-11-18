package Repetição;


/*Desenvolver um sistema que efetue a soma de todos os números ímpares
  que são múltiplos de três e que se encontram no conjunto dos números de 1
  até 500. (FOR)*/

public class Ex7 {
	public static void main (String args[])
	{
		int n, soma=0;
		
		for (n=1;n<=500;n++)
		{
			if (n%3==0 && n%2==1)
			{
				soma = soma + n;
			}
		}
		System.out.println(soma);
	}

}
