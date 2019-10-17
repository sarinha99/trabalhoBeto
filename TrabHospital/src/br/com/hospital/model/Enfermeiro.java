package br.com.hospital.model;

public class Enfermeiro  extends Funcionario{
	private int numeroRegistro;
	
	public void imprimir() {
		System.out.println("Numero do Registro: " + numeroRegistro);
		
	}

	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	
}
