package br.com.confidencecambio.javabasico.domain;

public class Entidade {
	
	private String nome;
	private String[] nomes;
	
	public Entidade(String nome) {
		super();
		if(!this.validaNome(nome))
			throw new IllegalArgumentException("O nome não pode ser null ou vazio");
		this.nome = nome.trim();
		this.nomes = this.nome.split(" ");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(!this.validaNome(nome))
			throw new IllegalArgumentException("O nome não pode ser null ou vazio");
		this.nome = nome.trim();
	}
	
	public Boolean validaNome(String nome) {
		if(nome != null && !nome.isBlank()) 
			return true;
		return false;
	}

	public String getPrimeiroNome() {
		return this.nomes[0];
	}
	
	public String getUltimoNome() {
		return nomes[this.nomes.length - 2] + " " + nomes[this.nomes.length - 1];
	}
	
	public String getNomeAbreviado() {
		String nomeAbreviado = this.nomes[0];
		for(int i = 1; i <= this.nomes.length - 2; i++) {
			nomeAbreviado += " " + this.nomes[i].substring(0, 1) + ".";
		}
		nomeAbreviado += " " + this.nomes[nomes.length - 1];	
		return nomeAbreviado;
	}
	
	public String getNomeMaiusculo() {
		return this.nome.toUpperCase();
	}
}
