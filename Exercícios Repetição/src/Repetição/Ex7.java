package Repeti��o;


/*Desenvolver um sistema que efetue a soma de todos os n�meros �mpares
  que s�o m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1
  at� 500. (FOR)*/

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
