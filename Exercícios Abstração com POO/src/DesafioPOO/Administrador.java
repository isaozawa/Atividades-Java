package DesafioPOO;

public class Administrador extends Pessoa {

	public Administrador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrador(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		// TODO Auto-generated constructor stub
	}
	
	private double ajudaDeCusto;

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	@Override
	public String toString() {
		return "Administrador [ nome=" + super.getNome() + ", endereco="
				+ super.getEndereco() + ", telefone=" + super.getTelefone()
				+ ", ajudaDeCusto=" + ajudaDeCusto + "]";
	}
	
	

	
}
