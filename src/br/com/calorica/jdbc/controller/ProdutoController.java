package br.com.calorica.jdbc.controller;

import java.sql.Connection;
import java.util.List;

import br.com.calorica.jdbc.dao.ProdutoDAO;
import br.com.calorica.jdbc.entity.Produto;
import br.com.calorica.jdbc.factory.ConnectionFactory;

public class ProdutoController {

	private ProdutoDAO produtoDao;
	
	public ProdutoController() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.produtoDao = new ProdutoDAO(connection);
	}
	
	public void deletar(Integer id) {
		produtoDao.deletar(id);
	}

	public void salvar(Produto produto) {
		produtoDao.salvarComCategoria(produto);
	}

	public List<Produto> listar() {
		return produtoDao.listar();
	}

	public void alterar(String nome, String descricao, Integer id) {
		produtoDao.alterar(nome, descricao, id);
	}
}
