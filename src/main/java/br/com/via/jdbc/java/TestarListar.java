package br.com.via.jdbc.java;

import java.sql.Connection;

import br.com.via.dao.UsuarioDAO;
import br.com.via.util.Conexao;

public class TestarListar {
	
	public static void main(String[] args) {
		Connection con = Conexao.abrirNovaConexao();
		UsuarioDAO dao = new UsuarioDAO(con);
		
		System.out.println(dao.listarTodos());
		
		Conexao.fecharConexao(con);
		
	}
}
