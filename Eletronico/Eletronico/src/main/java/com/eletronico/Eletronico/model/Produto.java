package com.eletronico.Eletronico.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String nome;
	
	@NotNull
	@Column(precision = 10, scale = 2)
	private double preco;
	
	@NotNull
	@Column(precision = 10, scale = 2)
	private double quantidade;
	
	@NotNull
	private String marca;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Categoria categoria;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private TipoEletro tipoEletro;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public TipoEletro getTipoEletro() {
		return tipoEletro;
	}

	public void setTipoEletro(TipoEletro tipoEletro) {
		this.tipoEletro = tipoEletro;
	}
	
	

}
