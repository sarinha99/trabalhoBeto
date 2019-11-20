package br.com.hospital.model;

import java.time.LocalDate;


public class Atendimento extends Paciente  {
	private int idAtendimento;
	private String comentarioEnfermeiro;
	private String comentario_Medico;
	private float peso;
	private float altura;
	private LocalDate data;
	private String doenca;
	
	public String getDoenca() {
		return doenca;
	}

	public void setDoenca(String txtDoenca) {
		this.doenca = txtDoenca;
	}

	public void imprimir() {
		System.out.println("Id Atendimeto : " +idAtendimento);
		System.out.println(" Comentario do Enfermeiro: " +comentarioEnfermeiro);
		System.out.println(" Comentario Do Medico: " +comentario_Medico);
		System.out.println(" Peso : " +peso);
		System.out.println(" Altura: " +altura);
		System.out.println("Data: " +data);
		System.out.println("Doença: " +doenca);
		
	}

	public int getIdAtendimento() {
		return idAtendimento;
	}

	public void setIdAtendimento(int idAtendimento) {
		this.idAtendimento = idAtendimento;
	}

	public String getComentarioEnfermeiro() {
		return comentarioEnfermeiro;
	}

	public void setComentarioEnfermeiro(String comentarioEnfermeiro) {
		this.comentarioEnfermeiro = comentarioEnfermeiro;
	}

	public String getComentario_Medico() {
		return comentario_Medico;
	}

	public void setComentario_Medico(String comentario_Medico) {
		this.comentario_Medico = comentario_Medico;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float pesos) {
		this.peso = pesos;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

}