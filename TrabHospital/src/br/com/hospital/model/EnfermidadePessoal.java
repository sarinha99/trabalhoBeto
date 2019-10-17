package br.com.hospital.model;

public class EnfermidadePessoal  extends Paciente{
	private int idEnfermidadePessoal;
	private String comentario;
	private String status_Enfermidade;
	
	public void imprimir() {
		System.out.println("Id da Enfermidade: " +idEnfermidadePessoal);
		System.out.println("Comentario: " +comentario);
		System.out.println("Status da Enfermidade: " +status_Enfermidade);
		
	}

	public int getIdEnfermidadePessoal() {
		return idEnfermidadePessoal;
	}

	public void setIdEnfermidadePessoal(int idEnfermidadePessoal) {
		this.idEnfermidadePessoal = idEnfermidadePessoal;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getStatus_Enfermidade() {
		return status_Enfermidade;
	}

	public void setStatus_Enfermidade(String status_Enfermidade) {
		this.status_Enfermidade = status_Enfermidade;
	}
	
}
