package DesafioPOO;

public class Fornecedor extends Pessoa {
	
	public Fornecedor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fornecedor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		// TODO Auto-generated constructor stub
	}
	
	private double valorCredito;
	private double valorDivida;
	private double obterSaldo;
	
		
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	
	
	public double getObterSaldo() {
		return valorCredito - valorDivida;
	}
	public void setObterSaldo(double obterSaldo) {
		this.obterSaldo = obterSaldo;
	}
	
	@Override
	public String toString() {
		return "Fornecedor [ nome=" + super.getNome() + ", endereco=" + 
				super.getEndereco() + ", telefone=" + super.getTelefone() + 
				", valorCredito=" + valorCredito + ", valorDivida=" + 
				valorDivida + ", obterSaldo=" + getObterSaldo() + "]";
	}
	
	
	
	
			
	
	}
	
	
	
	
	


