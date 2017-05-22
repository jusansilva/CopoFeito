package com.classe;
//Classe destinada para tratativa de Login dos usuários no e-commerce

public class Usuario extends Cliente {
	
	private int idUser;
	private String userLogin;
	private String userSenha;
	private int privilegio; 
	// privilegio 0 = admin 
	// privilegio 1 = usuario


	//Definição dos Getters and Setters
	public String getUserLogin() {
		return userLogin;
	}
	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}
	public String getUserSenha() {
		return userSenha;
	}
	public void setUserSenha(String userSenha) {
		this.userSenha = userSenha;
	}
	public int getPrivilegio() {
		return privilegio;
	}
	public void setPrivilegio(int privilegio) {
		this.privilegio = privilegio;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	//Definição dos Metodos Construtores da Classe
	public Usuario(String nomeCliente, String telCliente, String celCliente, String emailCliente,
			String enderecoCliente, int numeroEnd, String complementoEnd, int cepEnd, String cidadeEnd, String ufEnd,
			String cpfCliente, int idUser, String userLogin, String userSenha, int privilegio) {
		super(nomeCliente, telCliente, celCliente, emailCliente, enderecoCliente, numeroEnd, complementoEnd, cepEnd,
				cidadeEnd, ufEnd, cpfCliente);
		this.idUser = idUser;
		this.userLogin = userLogin;
		this.userSenha = userSenha;
		this.privilegio = privilegio;
	}	
	public Usuario (){}
	
	//Metodo ToString
	
	
	//Metodos .equals e hashCode
	
	
	
}
