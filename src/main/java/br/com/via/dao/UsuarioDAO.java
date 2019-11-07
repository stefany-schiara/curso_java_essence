package br.com.via.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.via.interfaces.InterfaceUsuarioDAO;
import br.com.via.model.Usuario;

public class UsuarioDAO extends ConnectAbstract implements InterfaceUsuarioDAO {
	
	public UsuarioDAO(Connection con) {
		super (con);
	}
	
	public String inserir(Usuario usuario) {
		String sql = "insert into usuario (usuario, senha, tipo)"
				+    "values (?, ?, ?)";
		try {
			
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, usuario.getUsuario());
			ps.setString(2, usuario.getSenha());
			ps.setString(3, usuario.getTipo());
			
			if (ps.executeUpdate() > 0) {
				return "Inserido com Sucesso";
			}else {
				return "Erro ao Inserir";
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		
	}

	public String alterar(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	public String excluir(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Usuario> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
