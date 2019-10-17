package br.com.hospital.model;

public class Funcionario  extends Pessoa{
	private  int idFuncionario;
	private String login;
	private String senha;
	private String status_Usuario;
	
	public void Imprimir() {
		System.out.println("Id Funcionario: " + idFuncionario);
		System.out.println(" Senha: " + senha);
		System.out.println("Status do Usuario: " +status_Usuario);
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getStatus_Usuario() {
		return status_Usuario;
	}

	public void setStatus_Usuario(String status_Usuario) {
		this.status_Usuario = status_Usuario;
	}
	
}
