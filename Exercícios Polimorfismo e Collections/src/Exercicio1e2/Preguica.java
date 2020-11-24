package Exercicio1e2;

public class Preguica extends Animal{

	public Preguica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Preguica(String nome, int idade, String som) {
		super(nome, idade, som);
		// TODO Auto-generated constructor stub
	}
	
	
	private String subirArvore;


	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}

	@Override
	public String toString() {
		return "Preguica [nome=" + super.getNome() + ", idade=" + 
				super.getIdade() + ", som=" + super.getSom() + 
				", subirArvore=" + subirArvore + "]";
	}
	
	
	

}
