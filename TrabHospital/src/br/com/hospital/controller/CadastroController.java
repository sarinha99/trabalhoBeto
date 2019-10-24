package br.com.hospital.controller;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import br.com.hospital.DAO.PacienteDAO;
import br.com.hospital.DAO.PessoaDAO;
import br.com.hospital.model.Paciente;
import br.com.hospital.model.Pessoa;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Labeled;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class CadastroController {

    @FXML
    private TextField nome;

    @FXML
    private TextField cpf;

    @FXML
    private  DatePicker date;

    @FXML
    private RadioButton rbAB;

    @FXML
    private ToggleGroup sangue;

    @FXML
    private RadioButton rbABnegativo;

    @FXML
    private RadioButton rbApositivo;

    @FXML
    private RadioButton rbAnegativo;

    @FXML
    private RadioButton rbB;

    @FXML
    private RadioButton rbOpositvo;

    @FXML
    private RadioButton rbOnegativo;

    @FXML
    private RadioButton rbMasculino;

    @FXML
    private ToggleGroup sexo;

    @FXML
    private RadioButton rbFeminino;

    @FXML
    private RadioButton cboSolteiro;

    @FXML
    private ToggleGroup STATUS;

    @FXML
    private RadioButton rbCasado;

    @FXML
    private Button btnFinalizar;

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnVoltar;

    @FXML
    void btnCancelar(ActionEvent event) {

    }

    @FXML
    void btnFinalizar(ActionEvent event) throws SQLException {
    	String nomes = nome.getText();
    	String cpfs = cpf.getText();
    	LocalDate dataNascimento = date.getValue();
    	//String tipo_sangue = sangue.getText();
    	String abNegativo = rbABnegativo.getText();
    	String abPositivo = rbApositivo.getText();
    	String a_negativo = rbAnegativo.getText();
    	String b = rbB.getText();
    	String o = rbOpositvo.getText();
    	String op = rbOnegativo.getText();
    	String  masculino = rbMasculino.getText();
    	String feminino = rbFeminino.getText();
    	String casado = rbCasado.getText();
    	String solteiro = cboSolteiro.getText();
    	
    	Pessoa pes = new Pessoa();
    	pes.setNome(nomes);
    	pes.setCpf(cpfs);
    	pes.setDataNascimento(dataNascimento);
    	pes.setTipo_Sanguinio(a_negativo);
    	pes.setTipo_Sanguinio(abPositivo);
    	pes.setTipo_Sanguinio(a_negativo);
    	pes.setTipo_Sanguinio(b);
    	pes.setTipo_Sanguinio(o);
    	pes.setTipo_Sanguinio(op);
    	pes.setSexo(masculino);
    	pes.setSexo(feminino);
    	pes.setStatus_Civil(casado);
    	pes.setStatus_Civil(solteiro);
    	
    	PessoaDAO cadastros = new PessoaDAO();
    	cadastros.save(pes);

    }

    @FXML
    void btnVoltar(ActionEvent event) {

    }

   

   
    @FXML
    void cpf(ActionEvent event) {

    }

    @FXML
    void date(ActionEvent event) {

    }

    @FXML
    void nome(ActionEvent event) {

    }

}
