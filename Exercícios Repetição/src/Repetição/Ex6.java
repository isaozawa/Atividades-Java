package Repeti��o;

import java.util.*;

/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
  coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:��
  a) m�dia do sal�rio da popula��o;
  b) m�dia do n�mero de filhos;
  c) maior sal�rio;
  d) percentual de pessoas com sal�rio at� R$100,00. (FOR)*/

public class Ex6 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner (System.in);
		int n; 
		double salario, tsalario=0, maior=0,medias=0, mediaf=0, percentual=0, ate100=0, filhos, tfilhos=0;
		
		for (n=1;n<=20;n++)
		{
			System.out.println("Insira o sal�rio");
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
		
		System.out.println("a) A m�dia do sal�rio � R$ " + medias);
		System.out.println("b) A m�dia de filhos � " + mediaf);
		System.out.println("c) O maior sal�rio � R$ "+ maior);
		System.out.println("d) O percentual de pessoas com sal�rio at� R$ 100,00 � "+percentual + "%");
	}

}
