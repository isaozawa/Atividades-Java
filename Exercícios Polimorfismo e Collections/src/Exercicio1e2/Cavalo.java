package Exercicio1e2;

public class Cavalo extends Animal {

	public Cavalo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cavalo(String nome, int idade, String som) {
		super(nome, idade, som);
		// TODO Auto-generated constructor stub
	}
	
	
	private String correr;


	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	@Override
	public String toString() {
		return "Cavalo [nome=" + super.getNome() + ", idade=" + 
				super.getIdade() + ", som=" + super.getSom() + 
				", correr=" + correr + "]";
	}
	
	

}
