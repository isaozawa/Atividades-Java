package DesafioPOO;

public class mainEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregado emp01 = new Empregado();
		
		emp01.setNome("Luis");
		emp01.setEndereco("Rua abc, 123");
		emp01.setTelefone("34567890");
		emp01.setCodigoSetor(789);
		emp01.setSalarioBase(2000);
		emp01.setImposto(0.20);
		
		System.out.println(emp01.toString());

	}

}
