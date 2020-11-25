package Exercicio3;

public class Estoque {
	private double valor;
	private int quantidade;
	private String nome;
	
	
	public Estoque(double valor, int quantidade, String nome) {
		super();
		//desconto de 100
		this.valor = valor - 100;
		this.quantidade = quantidade;
		this.nome = nome.toLowerCase();
	}
		
	public Estoque() {
		super();
	}


	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor - 100;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome.toLowerCase();
	}
	
	
	@Override
	public String toString() {
		return "Estoque [valor=" + valor + ", quantidade=" + quantidade + ", nome=" + nome + "]";
	}
	
	

}
