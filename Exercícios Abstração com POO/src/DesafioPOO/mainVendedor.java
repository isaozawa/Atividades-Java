package DesafioPOO;

public class mainVendedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vendedor vend05 = new Vendedor();
		
		vend05.setNome("Henrique");
		vend05.setEndereco("Rua 8 de maio, 58");
		vend05.setTelefone("32506985");
		vend05.setValorVendas(5000);
		vend05.setComissao(0.25);
		
		System.out.println(vend05.toString());

	}

}
