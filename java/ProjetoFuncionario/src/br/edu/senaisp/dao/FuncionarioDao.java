package br.edu.senaisp.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import br.edu.senaisp.model.Funcionario;
import br.edu.senaisp.util.Log;

public class FuncionarioDao {

	String PathBancoDeFuncionarios = "C:\\TEMP\\TesteDeArquivo\\BancoDeFuncionarios.txt";

	public boolean gravarDados(List<Funcionario> funcionario) throws Exception {

		PrintWriter pw;

		try {
			pw = new PrintWriter(PathBancoDeFuncionarios, Charset.forName("UTF-8"));

			for (Funcionario funcionario2 : funcionario) {
				pw.append(String.valueOf(funcionario2.getId()));
				pw.append(";" + funcionario2.getNome());
				pw.append(";" + funcionario2.getCpf());
				pw.append(";" + funcionario2.getCargo());
				pw.append("\n");
			}
			pw.close();
			return true;
		} catch (Exception e) {
			Log.escrever("Erro ao tentar gravar Funcionário: " + e.getMessage());
			throw new Exception("Erro ao tentar gravar Funcionários: " + e.getMessage());
		}

	}

	public List<Funcionario> lerFuncionarios() {
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(PathBancoDeFuncionarios));

			String linha;

			Funcionario tmp;
			while ((linha = br.readLine()) != null) {

				String[] palavras = linha.split(";");
				tmp = new Funcionario();
				tmp.setId(Long.parseLong(palavras[0]));
				tmp.setNome(palavras[1]);
				tmp.setCpf(palavras[2]);
				tmp.setCargo(palavras[3]);

				funcionarios.add(tmp);
			}

		} catch (Exception e) {
			Log.escrever(e.getMessage());
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				Log.escrever("N�o conseguiu liberar o recurso. " + e.getMessage());
			}
		}
		return funcionarios;
	}
}
