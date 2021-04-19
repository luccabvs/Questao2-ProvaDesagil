package br.edu.insper.desagil.questao2;

public class Produto {
	private Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	private String nome;
	private double preco;
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	
	

}
