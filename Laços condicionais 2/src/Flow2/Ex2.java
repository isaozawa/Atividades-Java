package Flow2;

import java.util.*;

/* Escreva um programa que verifique a validade de uma senha fornecida pelo usu�rio.
  A senha v�lida � o n�mero 1234. Devem ser impressas as seguintes mensagens: ACESSO PERMITIDO 
  caso a senha seja v�lida. ACESSO NEGADO caso a senha seja inv�lida.*/

public class Ex2 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int senha;
		
		System.out.println("Insira a senha: ");
		senha = ler.nextInt();
		
		if (senha == 1234)
		{
			System.out.println("\nACESSO PERMITIDO");
		}
		
		else
		{
			System.out.println("\nACESSO NEGADO");
		}
		
	}
	
	
	

}
