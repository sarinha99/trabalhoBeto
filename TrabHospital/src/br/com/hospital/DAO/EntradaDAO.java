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
			stmt . setDate ( 2 , java.sql . Date . valueOf (entrada.getDataEntrada ()));
			stmt . setDate ( 3 , java.sql . Date . valueOf (entrada.getDataSaida()));
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
		stmt . setDate ( 2 , java.sql . Date . valueOf (ent.getDataEntrada ()));
		       
		stmt . setDate ( 3 , java.sql . Date . valueOf (ent.getDataSaida ()));
	
				stmt.execute();
	}
	public void altera(Entrada en) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "UPDATE Entrada SET(?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt . setDate ( 2 , java.sql . Date . valueOf (en.getDataEntrada ()));
		stmt . setDate ( 2 , java.sql . Date . valueOf (en.getDataSaida ()));
						stmt.execute();
				stmt.execute();
	}
}

