package br.com.via.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
		String sql = "update usuario set usuario=?, senha=?, tipo=?"
				+    "where id=?";
		try {
			
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, usuario.getUsuario());
			ps.setString(2, usuario.getSenha());
			ps.setString(3, usuario.getTipo());
			ps.setInt(4, usuario.getId());
			
			if (ps.executeUpdate() > 0) {
				return "Alterado com Sucesso";
			}else {
				return "Erro ao alterar";
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			return "Erro ao alterar";
		}
	}

	public String excluir(Usuario usuario) {
		String sql = "delete from usuario where id=?";
		
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			
			ps.setInt(1, usuario.getId());
			
			ps.executeUpdate();
			return "Excluído com sucesso";
			
		} catch (Exception e) {
			return "erro ao excluir";
		}
	}

	public List<Usuario> listarTodos() {
		List<Usuario> usuarioList = new ArrayList<Usuario>();
		String sql = "select * from usuario";
		
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs  = ps.executeQuery(sql);
			
			while(rs.next()) {
				Usuario usuario = new Usuario();
				
				usuario.setId(rs.getInt("id"));
				usuario.setUsuario(rs.getString("usuario"));
				usuario.setTipo(rs.getString("tipo"));
								
				usuarioList.add(usuario);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return usuarioList;
	}
	
}
