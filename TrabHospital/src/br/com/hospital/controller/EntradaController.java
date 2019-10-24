package br.com.hospital.controller;

import java.sql.SQLException;
import java.time.LocalDate;

import br.com.hospital.DAO.EntradaDAO;
import br.com.hospital.DAO.PacienteDAO;
import br.com.hospital.model.Entrada;
import br.com.hospital.model.Paciente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class EntradaController {

    @FXML
    private DatePicker DataEntrada;

    @FXML
    private Button btnFinalizar;

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnVoltar;

    @FXML
    private DatePicker dateSaida;

    @FXML
    private TextField txtStatusPaciente;

    @FXML
    void btnCancelar(ActionEvent event) {

    }

    @FXML
    void btnFinalizar(ActionEvent event) throws SQLException {
    	LocalDate dataEntrada = DataEntrada.getValue(); 
    	LocalDate dataSaida = dateSaida.getValue();
    	String statusPaciente = txtStatusPaciente.getText();
    	Entrada entrada = new Entrada();
    	entrada.setDataEntrada(dataEntrada);
    	entrada.setDataSaida(dataSaida);
    	entrada.setStatus_Paciente(statusPaciente);
    	EntradaDAO entrada1 = new EntradaDAO();
    	entrada1.save(entrada);

    }

    @FXML
    void btnVoltar(ActionEvent event) {

    }

    @FXML
    void dateEntrada(ActionEvent event) {

    }

    @FXML
    void dateSaida(ActionEvent event) {

    }

    @FXML
    void txtStatusPaciente(ActionEvent event) {

    }

}

