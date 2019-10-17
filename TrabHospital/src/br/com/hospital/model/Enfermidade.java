package br.com.hospital.model;

public class Enfermidade  extends EnfermidadePessoal{
	private int idEnfermidade;
	private String nome;
	private String tipo;
	private String descricao;
	
	public void Imprimir() {
		
		System.out.println("Id Enfermidade: " +idEnfermidade);
		System.out.println("Nome: " +nome);
		System.out.println("Tipo: "+tipo);
		System.out.println("Descrição: " +descricao);
		
	}

	public int getIdEnfermidade() {
		return idEnfermidade;
	}

	public void setIdEnfermidade(int idEnfermidade) {
		this.idEnfermidade = idEnfermidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
