package DesafioPOO;

public class mainFornecedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fornecedor Maria = new Fornecedor();
		
		Maria.setNome("Maria");
		Maria.setEndereco("Rua Brasil, 65");
		Maria.setTelefone("32109876");
		Maria.setValorCredito(200);
		Maria.setValorDivida(50);
		Maria.getObterSaldo();

		
		System.out.println(Maria.toString());
			
		
		

	}

}
