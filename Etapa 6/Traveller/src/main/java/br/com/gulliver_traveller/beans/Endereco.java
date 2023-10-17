package br.com.gulliver_traveller.beans;

public class Endereco {
	private int id;
	private String cidade;
	private String estado;
	private String cep;
	private String rua;
	private int numero;
	private String complemento;
	private String referencia;
	private String bairro;
	
	public Endereco() {}

	public Endereco(int id, String cidade, String estado, String cep, String rua, int numero, String complemento,
			String referencia, String bairro) {
		super();
		this.id = id;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.referencia = referencia;
		this.bairro = bairro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
}
