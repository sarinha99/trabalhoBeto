package br.com.hospital.model;

import java.util.List;

public class Paciente extends Pessoa {
	private int  idPaciente;
	private String  doenca;
	private String  historico;
	
	public void Imprimir() {
		System.out.println("Id do Paciente: " +idPaciente);
		System.out.println("Doença: "+ doenca);
		System.out.println("Historico: " +historico);
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getDoenca() {
		return doenca;
	}

	public void setDoenca(  String doenca) {
		this.doenca = doenca;
	}

	public String getHistorico() {
		return historico;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}
	
}
