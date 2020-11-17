package Flow2;

import java.util.*;

/* Escreva um programa que verifique a validade de uma senha fornecida pelo usuário.
  A senha válida é o número 1234. Devem ser impressas as seguintes mensagens: ACESSO PERMITIDO 
  caso a senha seja válida. ACESSO NEGADO caso a senha seja inválida.*/

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
