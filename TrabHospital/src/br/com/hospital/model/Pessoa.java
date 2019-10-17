package br.com.hospital.model;

import java.util.Date;

public class Pessoa {
	 private String nome;
	 private String cpf;
	 private Date dataNascimento;
	 private  String tipo_sanguinio;
	 private String sexo;
	 private String status_Civil;
	 
	 
	 public void imprimir() {
		 System.out.println("Nome: " +nome);
		 System.out.println("CPF: " + cpf);
		 System.out.println("Data de Nascimento: " +dataNascimento);
		 System.out.println("Tipo Sanguinio: " + tipo_sanguinio);
		 System.out.println("Sexo: " + sexo);
		 System.out.println("Estado Civil: " +status_Civil);
		 
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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTipo_Sanguinio() {
		return tipo_sanguinio;
	}

	public void setTipo_Sanguinio(String tipo_Sanguinio) {
		tipo_sanguinio = tipo_Sanguinio;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getStatus_Civil() {
		return status_Civil;
	}

	public void setStatus_Civil(String status_Civil) {
		this.status_Civil = status_Civil;
	}

	public int getIdPessoa() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setStatusPessoa(String string) {
		// TODO Auto-generated method stub
		
	}
	 
}
