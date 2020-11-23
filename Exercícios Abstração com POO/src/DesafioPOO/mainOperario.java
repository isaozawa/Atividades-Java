package DesafioPOO;

public class mainOperario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operario op03 = new Operario();
		
		op03.setNome("Gabriela");
		op03.setEndereco("Avenida dos Abacates, 68");
		op03.setTelefone("36985214");
		op03.setValorProducao(1500);
		op03.setComissao(0.30);
		
		
		System.out.println(op03.toString());
	}

}
