package Repeti��o;

/*Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
   obtemos resto = 5. (FOR)*/

public class Ex1 {
	public static void main (String args[])
	{
		int n;
		
		for (n=1000; n<2000; n++)
		{
			if (n%11==5)
			{
				System.out.println(n);
			}
			
		}
	}

}
