package br.com.hospital.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hospital.conexao.Conexao;
import br.com.hospital.model.EnfermidadePessoal;

public class EnfermidadePessoalDAO {
	
public void save(EnfermidadePessoal ep) throws SQLException {

	Conexao conn = new  Conexao();
	Connection conexao =  conn.getConnection();
	System.out.println(conn.getStatus());
	String sqlInsere = "INSERT INTO EnfermidadePessoal VALUES(?,?,?)";
	PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
	stmt.setInt(1,ep.getIdEnfermidadePessoal());
	stmt.setString(2,ep.getComentario());
	stmt.setString(3,ep.getStatus_Enfermidade());
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
public void selecionar(EnfermidadePessoal ep) throws SQLException {
	Conexao conn = new Conexao();
	Connection conexao = conn.getConnection();
	System.out.println(conn.getStatus());
	String sqlInsere = "SELECT FROM EnfermidadePessoal(?,?,?)";
	PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			stmt.setInt(1,ep.getIdEnfermidadePessoal());
			stmt.setString(2,ep.getComentario());
			stmt.setString(3,ep.getStatus_Enfermidade());
			stmt.execute();
}
public void alterar(EnfermidadePessoal e) throws SQLException {
	Conexao conn = new Conexao();
	Connection conexao = conn.getConnection();
	System.out.println(conn.getStatus());
	String sqlInsere = "UPDATE EnfermidadePessoal SET(?,?,?)";
	PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			stmt.setInt(1,e.getIdEnfermidadePessoal());
			stmt.setString(2,e.getComentario());
			stmt.setString(3,e.getStatus_Enfermidade());
			stmt.execute();
}
	

}
