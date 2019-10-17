package br.com.hospital.model;

public class Gerente extends Funcionario {
	private String cargo;
	
	public void Imprimir() {
		System.out.println("Cargo :"+cargo);
		
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	

}
