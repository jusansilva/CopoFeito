package com.classe;
//Classe destinada para tratativa e manipulação do Bean Cliente

public class Cliente {
	
	private String nomeCliente;
	private String telCliente;
	private String celCliente;
	private String emailCliente;
	private String enderecoCliente;
	private int numeroEnd;
	private String complementoEnd;
	private int cepEnd;
	private String cidadeEnd;
	private String ufEnd;
	private String cpfCliente;
	
	// Definições dos Getters and Setters
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getTelCliente() {
		return telCliente;
	}
	public void setTelCliente(String telCliente) {
		this.telCliente = telCliente;
	}
	public String getCelCliente() {
		return celCliente;
	}
	public void setCelCliente(String celCliente) {
		this.celCliente = celCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public String getEnderecoCliente() {
		return enderecoCliente;
	}
	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	public int getNumeroEnd() {
		return numeroEnd;
	}
	public void setNumeroEnd(int numeroEnd) {
		this.numeroEnd = numeroEnd;
	}
	public String getComplementoEnd() {
		return complementoEnd;
	}
	public void setComplementoEnd(String complementoEnd) {
		this.complementoEnd = complementoEnd;
	}
	public int getCepEnd() {
		return cepEnd;
	}
	public void setCepEnd(int cepEnd) {
		this.cepEnd = cepEnd;
	}
	public String getCidadeEnd() {
		return cidadeEnd;
	}
	public void setCidadeEnd(String cidadeEnd) {
		this.cidadeEnd = cidadeEnd;
	}
	public String getUfEnd() {
		return ufEnd;
	}
	public void setUfEnd(String ufEnd) {
		this.ufEnd = ufEnd;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	
	//Definição dos Metodos Construtores da Classe
	public Cliente(String nomeCliente, String telCliente, String celCliente, String emailCliente,
			String enderecoCliente, int numeroEnd, String complementoEnd, int cepEnd, String cidadeEnd, String ufEnd,
			String cpfCliente) {
		super();
		this.nomeCliente = nomeCliente;
		this.telCliente = telCliente;
		this.celCliente = celCliente;
		this.emailCliente = emailCliente;
		this.enderecoCliente = enderecoCliente;
		this.numeroEnd = numeroEnd;
		this.complementoEnd = complementoEnd;
		this.cepEnd = cepEnd;
		this.cidadeEnd = cidadeEnd;
		this.ufEnd = ufEnd;
		this.cpfCliente = cpfCliente;
	}
	
	
	public Cliente(){}
	
	//Metodo toString
	public String toString() {
		return "Cliente [nomeCliente=" + nomeCliente + ", telCliente=" + telCliente + ", celCliente=" + celCliente
				+ ", emailCliente=" + emailCliente + ", enderecoCliente=" + enderecoCliente + ", numeroEnd=" + numeroEnd
				+ ", complementoEnd=" + complementoEnd + ", cepEnd=" + cepEnd + ", cidadeEnd=" + cidadeEnd + ", ufEnd="
				+ ufEnd + ", cpfCliente=" + cpfCliente + "]";
	}
	

	
	//Metodos .equals e hashCode
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((celCliente == null) ? 0 : celCliente.hashCode());
		result = prime * result + cepEnd;
		result = prime * result + ((cidadeEnd == null) ? 0 : cidadeEnd.hashCode());
		result = prime * result + ((complementoEnd == null) ? 0 : complementoEnd.hashCode());
		result = prime * result + ((cpfCliente == null) ? 0 : cpfCliente.hashCode());
		result = prime * result + ((emailCliente == null) ? 0 : emailCliente.hashCode());
		result = prime * result + ((enderecoCliente == null) ? 0 : enderecoCliente.hashCode());
		result = prime * result + ((nomeCliente == null) ? 0 : nomeCliente.hashCode());
		result = prime * result + numeroEnd;
		result = prime * result + ((telCliente == null) ? 0 : telCliente.hashCode());
		result = prime * result + ((ufEnd == null) ? 0 : ufEnd.hashCode());
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (celCliente == null) {
			if (other.celCliente != null)
				return false;
		} else if (!celCliente.equals(other.celCliente))
			return false;
		if (cepEnd != other.cepEnd)
			return false;
		if (cidadeEnd == null) {
			if (other.cidadeEnd != null)
				return false;
		} else if (!cidadeEnd.equals(other.cidadeEnd))
			return false;
		if (complementoEnd == null) {
			if (other.complementoEnd != null)
				return false;
		} else if (!complementoEnd.equals(other.complementoEnd))
			return false;
		if (cpfCliente == null) {
			if (other.cpfCliente != null)
				return false;
		} else if (!cpfCliente.equals(other.cpfCliente))
			return false;
		if (emailCliente == null) {
			if (other.emailCliente != null)
				return false;
		} else if (!emailCliente.equals(other.emailCliente))
			return false;
		if (enderecoCliente == null) {
			if (other.enderecoCliente != null)
				return false;
		} else if (!enderecoCliente.equals(other.enderecoCliente))
			return false;
		if (nomeCliente == null) {
			if (other.nomeCliente != null)
				return false;
		} else if (!nomeCliente.equals(other.nomeCliente))
			return false;
		if (numeroEnd != other.numeroEnd)
			return false;
		if (telCliente == null) {
			if (other.telCliente != null)
				return false;
		} else if (!telCliente.equals(other.telCliente))
			return false;
		if (ufEnd == null) {
			if (other.ufEnd != null)
				return false;
		} else if (!ufEnd.equals(other.ufEnd))
			return false;
		return true;
	}	
	
		

}
