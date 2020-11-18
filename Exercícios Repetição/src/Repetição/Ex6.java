package Repetição;

import java.util.*;

/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
  coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
  a) média do salário da população;
  b) média do número de filhos;
  c) maior salário;
  d) percentual de pessoas com salário até R$100,00. (FOR)*/

public class Ex6 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner (System.in);
		int n; 
		double salario, tsalario=0, maior=0,medias=0, mediaf=0, percentual=0, ate100=0, filhos, tfilhos=0;
		
		for (n=1;n<=20;n++)
		{
			System.out.println("Insira o salário");
			salario = ler.nextDouble();

			tsalario = tsalario + salario; 
			if (salario>maior)
			{
				maior=salario;
			}
			
			if (salario<=100)
			{
				ate100 = ate100 +1;
			}
			
			System.out.println("Insira quantos filhos");
			filhos = ler.nextInt();
			
			tfilhos = tfilhos + filhos;
			
		}
		
		medias = tsalario/20;
		mediaf = tfilhos/20;
		
		percentual = (ate100/20)*100;
		
		System.out.println("a) A média do salário é R$ " + medias);
		System.out.println("b) A média de filhos é " + mediaf);
		System.out.println("c) O maior salário é R$ "+ maior);
		System.out.println("d) O percentual de pessoas com salário até R$ 100,00 é "+percentual + "%");
	}

}
