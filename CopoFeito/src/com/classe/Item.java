package com.classe;
//Classe destinada para tratativa dos itens que vão compor a classe CarrinhoCopo

public class Item extends Copo {

	private int tamanho;
	private float valor;
	private int quantidade;

	// Definições dos Getters and Setters
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	//Definição dos Metodos Construtores da Classe
	public Item(int tamanho, float valor, int quantidade) {
		super();
		this.tamanho = tamanho;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	public Item(){}
	
	
	//Metodos .equals e hashCode
	
	
	
	
	
}
