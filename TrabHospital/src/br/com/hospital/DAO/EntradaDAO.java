package br.com.hospital.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import br.com.hospital.conexao.Conexao;
import br.com.hospital.model.Entrada;

public class EntradaDAO {

	public void save(Entrada entrada) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "insert into Entrada VALUES(?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			stmt.setInt(1,entrada.getIdPaciente());
			stmt.setBytes(2,(LocalDate) entrada.getDataEntrada());
		    stmt.setByte(3, (LocalDate) entrada.getDataSaida());
		    stmt.setString(4, entrada.getStatus_Paciente());
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
	   
		        stmt.setValues(1,(LocalDate) ent.getDataEntrada());
			
			    ((PreparedStatement) stmt).setLocalDate(3,(LocalDate) ent.getDataEntrada());
	
				stmt.execute();
	}
	public void altera(Entrada en) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "UPDATE Entrada SET(?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		                 stmt.setDataEntrada(2,(LocalDate) en.getDataEntrada());
					    stmt.setDate(3,(LocalDate) en.getDataEntrada());
						stmt.execute();
				stmt.execute();
	}
}

