package Ex2;

/*2) Crie uma classe avi�o e apresente os atributos e 
 * m�todos referentes esta classe, em seguida crie um objeto avi�o, 
 * defina as instancias deste objeto e apresente as informa��es deste 
 * objeto no console.*/

public class Aviao {
	private String modelo;
	private double tamanho;
	private int capacidade;
	private String Companhia;
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public String getCompanhia() {
		return Companhia;
	}
	public void setCompanhia(String companhia) {
		Companhia = companhia;
	}
	@Override
	public String toString() {
		return "Aviao [modelo=" + modelo + ", tamanho=" + tamanho + ", capacidade=" + capacidade + ", Companhia="
				+ Companhia + "]";
	}
	
	

}
