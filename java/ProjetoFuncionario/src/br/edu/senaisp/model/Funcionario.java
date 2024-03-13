package br.edu.senaisp.model;

public class Funcionario {

	private String nome;
	private String cpf;
	private String cargo;
	private Long id;
	
	public Funcionario() {
	}

	public Funcionario(String nome, String cpf, String cargo, Long id) {
	
		this.id = id;
		this.nome = nome;
		this.cargo = cargo;
		this.cpf = cpf;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
