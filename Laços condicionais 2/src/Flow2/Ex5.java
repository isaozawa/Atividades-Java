package Flow2;

import java.util.*;

/*Acrescente as seguintes mensagens à solução do exercício anterior conforme o caso. 
−   Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO. 
− Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO. */

public class Ex5 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int n;
		double L1, L2;
		
		System.out.println("Quantos lados tem o polígono? ");
		n = ler.nextInt();
		
		if (n == 3)
		{
			System.out.println("\nTRIÂNGULO \nQual a medida da base em cm? ");
			L1 = ler.nextDouble();
			
			System.out.println("\nQual a medida da altura em cm? ");
			L2 = ler.nextDouble();
			
			System.out.println("A área é: " + (L1*L2)/2 + "cm².");			
		}
		
		else if (n == 4)
		{
			System.out.println("\nQUADRADO \nQual a medida da base em cm? ");
			L1 = ler.nextDouble();
			
			System.out.println("\nQual a medida da altura em cm? ");
			L2 = ler.nextDouble();
			
			System.out.println("A área é: " + (L1*L2) + "cm².");
		}
		
		else if (n == 5)
		{
			System.out.println("\nPENTÁGONO");
		}
		
		else  if (n<3)
		{
			System.out.println("\nNÃO É UM POLÍGONO");
		}
		
		else
		{
			System.out.println("\nPOLÍGONO NÃO IDENTIFICADO");
		}
	}

}
