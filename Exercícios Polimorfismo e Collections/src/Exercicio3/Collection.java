package Exercicio3;

import java.util.ArrayList;
import java.util.List;

/*Crie uma um programa para trabalhar com estoque de uma loja, 
 * o programa deverá trabalhar com Collection do tipo List do Java 
 * para manipular os dados desse estoque, o programa deverá atender as 
 * seguintes funcionalidades:

   Armazenar dados da List
   Remover dados da list;
   Atualizar dados da list.
   Apresentar todos os dados da list. */

public class Collection {
	public static void main(String args[])
	{
		List <Estoque> produtos = new ArrayList<Estoque>();
		
		
		produtos.add(new Estoque(1500, 8, "Celular"));
		produtos.add(new Estoque(2500, 20, "Notebook"));
		produtos.add(new Estoque(100, 6, "Carregador Portátil"));
		produtos.add(new Estoque(350.50, 4, "Caixa de Som"));
		
		//método try e catch pra encontrar erros
		try {
			for (Estoque produto : produtos) {
				//index pra ordenar os itens
				System.out.println("[ index= " + produtos.indexOf(produto) + 
									" valor = " + produto + " ]");
			//	Double.parseDouble("batatinha");
			}
		} catch (Exception e) {
			// TODO: handle exception
			//traz o tipo de erro
			System.out.println(e.toString());
			
		}
		finally {
			System.out.println("Estou finalizando");
		}
		
		//troca o produto de acorod com a posição
		produtos.set(0, new Estoque(1800, 7, "Smartphone"));
		
		produtos.remove(new Estoque(350.50, 4, "Caixa de Som"));
		
		//escreve um por linha
		for (Estoque produto : produtos) {
			System.out.println(produto);
		}
		
		
		
		
		
		
	}

}
