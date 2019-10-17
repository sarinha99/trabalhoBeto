package br.com.hospital.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.hospital.conexao.Conexao;
import br.com.hospital.model.Medico;


public class MedicoDAO {
   
	public void save(Medico m) throws SQLException {
		
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		
		System.out.println(conn.getStatus());
		
		String sqlINSERE = "INSERT INTO medico VALUES(?,?,?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sqlINSERE);
		stmt.setInt(1,m.getNumeroRegistro());
		stmt.setString(2,m.getEspecilidade());
		stmt.execute();
	}
	
	public void removeById(int id) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		
		System.out.println(conn.getStatus());
		
		String sqlDELETE = "DELETE FROM medico VALUES(?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sqlDELETE);
		stmt.setInt(1,id);
		stmt.execute();
	}
	public void selecionar(Medico med) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "SELECT * FROM Medico";
		
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		ResultSet rs = stmt.executeQuery();
		ArrayList<Medico> Listmedico = new ArrayList<Medico>();
		while(rs.next()) {
			Medico Med= new Medico();
			
			Med.setNumeroRegistro(rs.getInt("numeroRegistro"));
							
			}
		
	}
}
