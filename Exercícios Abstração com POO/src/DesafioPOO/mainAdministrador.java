package DesafioPOO;

public class mainAdministrador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Administrador adm02 = new Administrador();
		
		adm02.setNome("Felipe");
		adm02.setEndereco("Rua 5 de abril, 85");
		adm02.setTelefone("32635963");
		adm02.setAjudaDeCusto(250);
		
		System.out.println(adm02.toString());

	}

}
