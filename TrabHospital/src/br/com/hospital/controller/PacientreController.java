package br.com.hospital.controller;

import java.sql.SQLException;

import br.com.hospital.DAO.PacienteDAO;
import br.com.hospital.model.Paciente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PacientreController {

    @FXML
    private TextField txtDoenca;

    @FXML
    private TextField historico;

    @FXML
    private Button finalizar;

    @FXML
    private Button cancelar;

    @FXML
    private Button voltar;

    @FXML
    void btnCancelar(ActionEvent event) {

    }

    @FXML
    void btnFinalizar(ActionEvent event) throws SQLException {
    	String doenca = txtDoenca.getText();
    	String historicos = historico.getText();
    	Paciente paciente = new Paciente();
    	paciente.setDoenca(doenca);
    	paciente.setHistorico(historicos);
    	PacienteDAO pacientes = new PacienteDAO();
    	pacientes.save(paciente);
    }

    @FXML
    void btnVoltar(ActionEvent event) {
    	
    }

    @FXML
    void historico(ActionEvent event) {

    }

    @FXML
    void txtdoenca(ActionEvent event) {

    }

}
