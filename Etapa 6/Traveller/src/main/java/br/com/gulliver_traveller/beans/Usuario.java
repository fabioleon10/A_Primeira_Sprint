package br.com.gulliver_traveller.beans;

import java.sql.Date;

public class Usuario {
	private String nome;
	private String sobrenome;
	private String email;
	private String senha;
	private String telefone;
	private String tipo_documento;
	private String documento;
	private Date data_emissao_documento;
	private String sexo;
	private Date data_nascimento;
	private String profissao;
	private Endereco endereco;
	
	public Usuario() {
	}

	public Usuario(String nome, String sobrenome, String email, String senha, String telefone, String tipo_documento,
			String documento, Date data_emissao_documento, String sexo, Date data_nascimento,
			String profissao, Endereco endereco) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.senha = senha;
		this.telefone = telefone;
		this.tipo_documento = tipo_documento;
		this.documento = documento;
		this.data_emissao_documento = data_emissao_documento;
		this.sexo = sexo;
		this.data_nascimento = data_nascimento;
		this.profissao = profissao;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTipo_documento() {
		return tipo_documento;
	}

	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Date getData_emissao_documento() {
		return data_emissao_documento;
	}

	public void setData_emissao_documento(Date data_emissao_documento) {
		this.data_emissao_documento = data_emissao_documento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
