package br.com.via.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/java";
	private static final String USER = "root";
	private static final String PASS = "";
	
	public static Connection abrirNovaConexao(){
		Connection con = null;
		
		
		try {
			
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER, PASS);
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Conexao aberta");
		return con;
	}
	
	public static void fecharConexao(Connection con) {
		
		try {
			con.close();
			System.out.println("Conexao fechada");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
