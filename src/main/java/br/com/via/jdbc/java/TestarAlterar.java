package br.com.via.jdbc.java;

import java.sql.Connection;

import br.com.via.dao.UsuarioDAO;
import br.com.via.model.Usuario;
import br.com.via.util.Conexao;

public class TestarAlterar {

	public static void main(String[] args) {

		Connection con = Conexao.abrirNovaConexao();
		UsuarioDAO dao = new UsuarioDAO(con);
		
		Usuario usuario = new Usuario();
		usuario.setUsuario("Stefany");
		usuario.setSenha("4321");
		usuario.setTipo("desenv");
		usuario.setId(1);
		
		System.out.println(dao.alterar(usuario));
		
	}

}
