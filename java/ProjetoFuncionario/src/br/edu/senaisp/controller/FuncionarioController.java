package br.edu.senaisp.controller;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import br.edu.senaisp.dao.FuncionarioDao;
import br.edu.senaisp.model.Funcionario;
import br.edu.senaisp.view.FuncionarioView;

public class FuncionarioController {

	public static void main(String[] args) throws FileNotFoundException {

		FuncionarioView frmPri = new FuncionarioView();
		frmPri.show();

		FuncionarioDao dao = new FuncionarioDao();
		List<Funcionario> novaLista = new ArrayList<Funcionario>();
		novaLista = dao.lerFuncionarios();

		for (Funcionario funcionario : novaLista) {
			System.err.println(funcionario.getNome());
		}

	}
}
