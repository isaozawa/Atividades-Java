package DesafioPOO;

public class Vendedor extends Pessoa{

	public Vendedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vendedor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		// TODO Auto-generated constructor stub
	}

	
	private double valorVendas;
	private double comissao;
	private double valorFinal;
	
	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getValorFinal() {
		return valorVendas + (valorVendas*comissao);
	}

	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}

	@Override
	public String toString() {
		return "Vendedor [ nome=" + super.getNome() + ", endereco=" +
				super.getEndereco() + ", telefone=" + super.getTelefone() + 
				", valorVendas=" + valorVendas + ", comissao=" 
				+ comissao + ", valorFinal=" + getValorFinal() + "]";
	}
	
	
	
	

}
