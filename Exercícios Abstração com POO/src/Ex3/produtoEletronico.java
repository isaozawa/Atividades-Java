package Ex3;

/*3) Crie uma classe produto eletr�nico e apresente os atributos 
 * e m�todos referentes esta classe, em seguida crie um objeto 
 * produto eletr�nico, defina as instancias deste objeto e apresente 
 * as informa��es deste objeto no console.*/

public class produtoEletronico {
	private String nome;
	private String marca;
	private double pre�o;
	private String cor;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	@Override
	public String toString() {
		return "produtoEletronico [nome=" + nome + ", marca=" + marca + ", pre�o=" + pre�o + ", cor=" + cor + "]";
	}
	
	
	
	

}
