package br.com.hospital.DAO;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import br.com.hospital.conexao.Conexao;
import br.com.hospital.model.Pessoa;

public class PessoaDAO {
	public void save(Pessoa pes) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "insert into Pessoa VALUES(?,?,?,?,?,?,?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
				stmt.setInt(1,pes.getIdPessoa());
				stmt.setString(2,pes.getNome());
				stmt.setString(3,pes.getCpf());
				stmt.setDate(4,(Date) pes.getValues());
				stmt.setString(5,pes.getTipo_Sanguinio());
				
				stmt.setString(6,pes.getSexo());
				stmt.setString(7,pes.getStatus_Civil());
				
				stmt.execute();
	}
	public void removeById(int id) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "DELETE FROM Pessoa WHERE id(?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			stmt.setInt(1,id);	
			stmt.execute();
	}
	public void selecionar(Pessoa pes) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "SELECT * FROM Pessoa";
		
		
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		ResultSet rs = stmt.executeQuery();
		ArrayList<Pessoa> listpessoa = new ArrayList<Pessoa>();
		
		while(rs.next()) {
		Pessoa p1= new Pessoa();
		
		p1.setNome(rs.getString("nome"));
		p1.setCpf(rs.getString("cpf"));
		p1.setValues(rs.getDate("dataNascimento"));
		p1.setTipo_Sanguinio(rs.getString("tipoSanguinio"));
		p1.setSexo(rs.getString("sexo"));
		p1.setStatus_Civil(rs.getString("statusCivil"));
		listpessoa.add(p1);
			
		}
	}	
	public void alterar(Pessoa pes) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String alterar = "UPDATE Pessoa SET(?,?,?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(alterar);
		stmt.setInt(1,pes.getIdPessoa());
		stmt.setString(2,pes.getNome());
		stmt.setString(3,pes.getCpf());
		stmt.setDate(4,(Date) pes.getValues());
		stmt.setString(5,pes.getTipo_Sanguinio());
		stmt.setString(6,pes.getSexo());
		stmt.setString(7,pes.getStatus_Civil());
				stmt.execute();
	}
}

