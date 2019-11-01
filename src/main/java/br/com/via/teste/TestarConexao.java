package br.com.via.teste;

import java.sql.Connection;

import br.com.via.util.Conexao;

public class TestarConexao {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		Connection con = Conexao.abrirNovaConexao();
		Conexao.fecharConexao(con);
		
	}
}
