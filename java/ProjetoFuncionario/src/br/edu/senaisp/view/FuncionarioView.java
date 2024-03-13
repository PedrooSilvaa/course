package br.edu.senaisp.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import br.edu.senaisp.dao.FuncionarioDao;
import br.edu.senaisp.model.Funcionario;

public class FuncionarioView extends JFrame {

	private JButton btnNovo = new JButton("Novo Funcionário");
	private JLabel lblLista = new JLabel("Lista de Funcionários");
	private JTextArea txtLista = new JTextArea();

	private List<Funcionario> funcionarios = new ArrayList<Funcionario>();

	public FuncionarioView() {
		inicializar();
		acoes();
		preencherFuncionarios();
	}

	private void inicializar() {

		this.setLayout(null);
		this.btnNovo.setBounds(50, 30, 150, 20);
		this.lblLista.setBounds(50, 70, 300, 20);
		this.txtLista.setBounds(50, 90, 300, 400);

		this.getContentPane().add(btnNovo);
		this.getContentPane().add(lblLista);
		this.getContentPane().add(txtLista);

		this.setVisible(true);
		this.setSize(400, 600);

	}

	public void acoes() {
		btnNovo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				FuncionarioDetView fun = new FuncionarioDetView();
				fun.show();

				Funcionario tmp = fun.getFuncionario();

				if (tmp.getId() != null && tmp.getNome() != null && tmp.getCpf() != null && tmp.getCargo() != null) {
					funcionarios.add(tmp);
					FuncionarioDao dao = new FuncionarioDao();
					try {
						dao.gravarDados(funcionarios);

					} catch (Exception e2) {

						JOptionPane.showMessageDialog(fun, e2.getMessage());
					}
					txtLista.setText("");
					preencherFuncionarios();
				}
			}
		});
	}

	public void preencherFuncionarios() {
		FuncionarioDao dao = new FuncionarioDao();
		funcionarios = dao.lerFuncionarios();
		for (Funcionario fun : funcionarios) {
			txtLista.append(fun.getNome() + " (" + fun.getCpf() + ") - " + fun.getCargo());
			txtLista.append("\n");
		}

	}
}
