package br.com.hospital.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hospital.conexao.Conexao;
import br.com.hospital.model.Entrada;

public class EntradaDAO {

	public void save(Entrada ent) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "insert into Entrada VALUES(?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			stmt.setInt(1,ent.getIdPaciente());
			stmt.setDate(2,(Date) ent.getDataEntrada());
		    stmt.setDate(3, (Date) ent.getDataSaida());
		    stmt.setString(4, ent.getStatus_Paciente());
		    stmt.execute();
	}
	public void retiraById(int id) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "DELETE FROM Entrada WHERE id(?)";	
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			stmt.setInt(1,id);	
			stmt.execute();
	}
	public void seleciona(Entrada ent) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "SELECT FROM Entrada(?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
	   
		        stmt.setDate(1,(Date) ent.getDataEntrada());
			
			    ((PreparedStatement) stmt).setDate(3,(Date) ent.getDataEntrada());
	
				stmt.execute();
	}
	public void altera(Entrada en) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "UPDATE Entrada SET(?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		                 stmt.setDate(2,(Date) en.getDataEntrada());
					    stmt.setDate(3,(Date) en.getDataEntrada());
						stmt.execute();
				stmt.execute();
	}
}

