package DesafioPOO;

public class Operario extends Pessoa {

	public Operario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Operario(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		// TODO Auto-generated constructor stub
	}
	
	
	private double valorProducao;
	private double comissao;
	private double valorFinal;
	
	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getValorFinal() {
		return valorProducao + (valorProducao*comissao);
	}

	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}

	
	@Override
	public String toString() {
		return "Operario [ nome=" + super.getNome() + ", endereco="
				+ super.getEndereco() + ", telefone=" + super.getTelefone() +
				", valorProducao=" + valorProducao + ", comissao=" + comissao +
				", valorFinal=" + getValorFinal() + "]";
	}
	
	
	
	
	
	

}
