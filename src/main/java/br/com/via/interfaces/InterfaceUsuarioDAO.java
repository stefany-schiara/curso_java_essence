package br.com.via.interfaces;

import java.util.List;

import br.com.via.model.Usuario;

public interface InterfaceUsuarioDAO {

	String inserir(Usuario usuario);
	String alterar(Usuario usuario);
	String excluir(Usuario usuario);
	List <Usuario> listarTodos();
}
