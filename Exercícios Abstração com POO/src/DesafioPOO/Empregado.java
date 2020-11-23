package DesafioPOO;

public class Empregado extends Pessoa{

	public Empregado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empregado(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		// TODO Auto-generated constructor stub
	}
	
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	private double calcularSalario;
	
	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public double getCalcularSalario() {
		return salarioBase - (salarioBase*imposto);
	}

	public void setCalcularSalario(double calcularSalario) {
		this.calcularSalario = calcularSalario;
	}

	@Override
	public String toString() {
		return "Empregado [ nome=" + super.getNome() + ", endereco="
				+ super.getEndereco() + ", telefone=" + super.getTelefone()
				+ "codigoSetor=" + codigoSetor + ", salarioBase=" + salarioBase 
				+ ", imposto=" + imposto + ", calcularSalario=" + getCalcularSalario() + "]";
	}
	
	
	

}
