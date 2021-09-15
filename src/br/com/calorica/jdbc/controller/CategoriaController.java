package br.com.calorica.jdbc.controller;

import java.sql.Connection;
import java.util.List;

import br.com.calorica.jdbc.dao.CategoriaDAO;
import br.com.calorica.jdbc.entity.Categoria;
import br.com.calorica.jdbc.factory.ConnectionFactory;

public class CategoriaController {

	private CategoriaDAO categoriaDao;

	public CategoriaController()  {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.categoriaDao = new CategoriaDAO(connection);

	}

	public List<Categoria> listar() {
		return this.categoriaDao.listar();
	}
}
