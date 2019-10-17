package br.com.hospital.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hospital.conexao.Conexao;
import br.com.hospital.model.Enfermeiro;

public class EnfermeiroDAO {
	public void save(Enfermeiro enf) throws SQLException {
		Conexao conn = new  Conexao();
		Connection conexao =  conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere ="INSERT INTO Enfermeiro VALUES (?,?) ";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		
		stmt.setInt(1, enf.getIdFuncionario());
		stmt.setInt(2, enf.getNumeroRegistro());
		
		
		stmt.execute();
	}

	public void removeById(int id) throws SQLException {
		Conexao conn = new  Conexao();
		Connection conexao =  conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere ="DELETE from Enfermeiro where id =(?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		
		stmt.setInt(1,id);
		stmt.execute();
		stmt.execute();
		
	}
	
	public void selecionar (Enfermeiro enf) throws SQLException {
		Conexao conn = new  Conexao();
		Connection conexao =  conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere ="select  from  Enfermeiro VALUES (?,?) ";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		
		stmt.setInt(1, enf.getIdFuncionario());
		stmt.setInt(2, enf.getNumeroRegistro());
		
		stmt.execute();
		
		
	}
	public void altera (Enfermeiro enf) throws SQLException {
		Conexao conn = new  Conexao();
		Connection conexao =  conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere ="update Enfermeiro set (?,?) ";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		
		stmt.setInt(1, enf.getIdFuncionario());
		stmt.setInt(2, enf.getNumeroRegistro());
		
		
		stmt.execute();

	}
}
