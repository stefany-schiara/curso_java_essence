package br.com.via.model;

import java.io.Serializable;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	public Usuario() {
	}
	
	public Usuario(int id, String usuario, String senha, String tipo) {

     	this.id = id;
		this.usuario = usuario;
		this.senha = senha;
		this.tipo = tipo;
	}
	
	private int id;
	private String usuario;
	private String senha;
	private String tipo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
