package br.com.hospital.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hospital.conexao.Conexao;
import br.com.hospital.model.EnfermidadePessoal;

public class EnfermidadeDAO {
	
public void save(EnfermidadePessoal enfpes) throws SQLException {

	Conexao conn = new  Conexao();
	Connection conexao =  conn.getConnection();
	System.out.println(conn.getStatus());
	String sqlInsere = "INSERT INTO EnfermidadePessoal VALUES(?,?,?)";
	PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
	stmt.setInt(1,enfpes.getIdEnfermidadePessoal());
	stmt.setString(2,enfpes.getComentario());
	stmt.setString(3,enfpes.getStatus_Enfermidade());
	stmt.execute();	
	}
public void removeById(int id) throws SQLException {
	Conexao conn = new Conexao();
	Connection conexao = conn.getConnection();
	System.out.println(conn.getStatus());
	String sqlInsere = "DELETE FROM EnfermidadePessoal WHERE id(?)";	
	PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1,id);	
		stmt.execute();
}
public void selecionar(EnfermidadePessoal enfpes) throws SQLException {
	Conexao conn = new Conexao();
	Connection conexao = conn.getConnection();
	System.out.println(conn.getStatus());
	String sqlInsere = "SELECT FROM EnfermidadePessoal(?,?,?)";
	PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			stmt.setInt(1,enfpes.getIdEnfermidadePessoal());
			stmt.setString(2,enfpes.getComentario());
			stmt.setString(3,enfpes.getStatus_Enfermidade());
			stmt.execute();
}
public void alterar(EnfermidadePessoal enp) throws SQLException {
	Conexao conn = new Conexao();
	Connection conexao = conn.getConnection();
	System.out.println(conn.getStatus());
	String sqlInsere = "UPDATE EnfermidadePessoal SET(?,?,?)";
	PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			stmt.setInt(1,enp.getIdEnfermidadePessoal());
			stmt.setString(2,enp.getComentario());
			stmt.setString(3,enp.getStatus_Enfermidade());
			stmt.execute();
}
	

}
