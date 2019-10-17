package br.com.hospital.model;

public class Medico  extends Funcionario{
	private int numeroRegistro;
	private String especilidade;
	
	public void Imprimir() {
		System.out.println(" Numero Do Registro: " +numeroRegistro);
		System.out.println("Especialidade: " +especilidade);
		
	}

	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public String getEspecilidade() {
		return especilidade;
	}

	public void setEspecilidade(String especilidade) {
		this.especilidade = especilidade;
	}
	
}
