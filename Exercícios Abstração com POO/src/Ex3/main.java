package Ex3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		produtoEletronico categoria = new produtoEletronico();
		
		categoria.setNome("Celular");
		categoria.setMarca("IPhone 12");
		categoria.setPreço(5);
		categoria.setCor("Vermelho");
		
		System.out.println(categoria.toString());

	}

}
