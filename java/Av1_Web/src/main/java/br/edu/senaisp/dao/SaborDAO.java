package br.edu.senaisp.dao;

import java.sql.Connection;

import br.edu.senaisp.model.Sabor;

public class SaborDAO {

	public void novo(Sabor sabor) {
		
		try {
			Connection con = dao.Conexao();
		
			System.out.println(con.isClosed());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}