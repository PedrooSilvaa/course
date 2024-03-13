package br.edu.senaisp.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.edu.senaisp.model.Funcionario;

public class FuncionarioDetView extends JDialog {

	JLabel lblId = new JLabel("Id: ");
	JTextField txtId = new JTextField(null, 20);

	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField(null, 20);

	JLabel lblCpf = new JLabel("CPF: ");
	JTextField txtCpf = new JTextField(null, 20);

	JLabel lblCargo = new JLabel("Cargo: ");
	JTextField txtCargo = new JTextField(null, 20);

	JButton btnGravar = new JButton("Gravar");
	JButton btnFechar = new JButton("Fechar");

	private Funcionario func = new Funcionario();

	public FuncionarioDetView() {
		this.setLayout(new FlowLayout());

		this.getContentPane().add(lblId);
		this.getContentPane().add(txtId);

		this.getContentPane().add(lblNome);
		this.getContentPane().add(txtNome);

		this.getContentPane().add(lblCpf);
		this.getContentPane().add(txtCpf);

		this.getContentPane().add(lblCargo);
		this.getContentPane().add(txtCargo);

		this.getContentPane().add(btnGravar);
		this.getContentPane().add(btnFechar);

		btnGravar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (txtId.getText() != null && txtNome.getText() != null && txtCpf.getText() != null
						&& txtCargo.getText() != null) {
					func.setId(Long.parseLong(txtId.getText()));
					func.setNome(txtNome.getText());
					func.setCpf(txtCpf.getText());
					func.setCargo(txtCargo.getText());
				}

				hide();

			}
		});

		btnFechar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				hide();

			}
		});

		this.setSize(200, 380);
		this.setModal(true);

	}

	public Funcionario getFuncionario() {
		return func;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.func = funcionario;
	}

}
