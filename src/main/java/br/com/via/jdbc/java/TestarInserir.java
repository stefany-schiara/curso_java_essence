package br.com.via.jdbc.java;

import java.sql.Connection;

import br.com.via.dao.UsuarioDAO;
import br.com.via.model.Usuario;
import br.com.via.util.Conexao;

public class TestarInserir {

	public static void main(String[] args) {
		Connection con = Conexao.abrirNovaConexao();
		
		Usuario usuario = new Usuario();
		usuario.setUsuario("Ricardo");
		usuario.setSenha("123");
		usuario.setTipo("admin");
		UsuarioDAO dao = new UsuarioDAO(con);
		System.out.println(dao.inserir(usuario));
		
		Conexao.fecharConexao(con);

	}

}
