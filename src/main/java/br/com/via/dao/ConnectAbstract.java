package br.com.via.dao;

import java.sql.Connection;

public abstract class ConnectAbstract {
	
	private Connection con;

	
	public ConnectAbstract(Connection con) {
		super();
		this.con = con;
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
}
