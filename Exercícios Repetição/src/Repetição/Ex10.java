package Repeti��o;

/*Fa�a um programa que mostre uma contagem na tela de 233 a 456, s� que
  contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando n�o
  estiver. (DO...WHILE)*/

public class Ex10 {
	public static void main (String args[])
	{
		int n=233;
		
		
		do
		{
			if (n<300 || n>400)
			{
				System.out.println(n);
				n = n + 5;	
			}
			else // if (n>300 && n<400)
			{
				System.out.println(n);
				n = n + 3;	
			}
			
	
		}
		while (n<=456);

		
	}

}
