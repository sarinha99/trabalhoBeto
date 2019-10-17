package br.com.hospital.controller;
import br.com.hospital.DAO.AtendimentoDAO;
import br.com.hospital.model.Atendimento;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class AtendimentoController {

    @FXML
    private Button btnFinalizar;

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextArea txtComentarioEnfermeiro;

    @FXML
    private TextArea txtComentarioMedico;

    @FXML
    private TextField peso;

    @FXML
    private TextField altura;

    @FXML
    private DatePicker date;

    @FXML
    private TextField txtDoenca;

    @FXML
    void btnCancelar(ActionEvent event) {

    }

    @FXML
    void btnFinalizar(ActionEvent event) {
    	String comentarioEnfermeiro = txtComentarioEnfermeiro.getText();
    	String comentarioMedico = txtComentarioMedico.getText();
    	float pesos=Float.parseFloat(peso.getText());
    	float  alturas = Float.parseFloat(altura.getText());
    	String  data = date.getPromptText();
    	String doencas = txtDoenca.getText();

    	Atendimento atendimento = new Atendimento();
    	atendimento.setComentarioEnfermeiro(comentarioEnfermeiro);
    	atendimento.setComentario_Medico(comentarioMedico);
    	atendimento.setPeso(pesos);
    	atendimento.setAltura(alturas);
    	atendimento.setDoenca(doencas);
    	AtendimentoDAO paciente = new AtendimentoDAO();
    	atendimento.save(atendimento);

    }

    @FXML
    void btnVoltar(ActionEvent event) {

    }

    @FXML
    void date(ActionEvent event) {

    }

    @FXML
    void floatAltura(ActionEvent event) {

    }

    @FXML
    void floatPeso(ActionEvent event) {

    }

    @FXML
    void txtComentarioEnfermeiro(MouseEvent event) {

    }

    @FXML
    void txtComentarioMedico(MouseEvent event) {

    }

    @FXML
    void txtDoenca(ActionEvent event) {

    }

}
