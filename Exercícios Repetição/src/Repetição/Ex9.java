package Repeti��o;

import java.util.*;

/*Obtenha um n�mero digitado pelo usu�rio e repita a opera��o de multiplicar ele
  por tr�s (imprimindo o novo valor) at� que ele seja maior do que 100. Ex.: se o
  usu�rio digita 5, deveremos observar na tela a seguinte sequ�ncia: 5 15 45
  135. (WHILE)*/

public class Ex9 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int n, total=0;
				
		System.out.println("Digite um n�mero");
		n = ler.nextInt();
		total = n;
		System.out.println("\n" + total);
		
		while (total<=100)
		{	
			
			if (total<=100)
			{
				total = total*3;
				System.out.println(total);
			}
			
			else
			{
				total=total*3;
				System.out.println(total);
			}
			
		}
	}

}
