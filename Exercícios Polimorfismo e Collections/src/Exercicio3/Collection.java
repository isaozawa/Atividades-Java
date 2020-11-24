package Exercicio3;

import java.util.ArrayList;
import java.util.List;

/*Crie uma um programa para trabalhar com estoque de uma loja, 
 * o programa dever� trabalhar com Collection do tipo List do Java 
 * para manipular os dados desse estoque, o programa dever� atender as 
 * seguintes funcionalidades:

   Armazenar dados da List
   Remover dados da list;
   Atualizar dados da list.
   Apresentar todos os dados da list. */

public class Collection {
	public static void main(String args[])
	{
		List <String> produtos = new ArrayList();
		
		produtos.add("Celular");
		produtos.add("Notebook");
		produtos.add("Carregador Port�til");
		produtos.add("Caixa de Som");
		
		System.out.println("Estoque: " + produtos);
		
		
		produtos.remove("Caixa de Som");
		
		System.out.println("Estoque: " + produtos);
		
	}

}
