package br.com.hospital.controller;


	import br.com.hospital.DAO.AtendimentoDAO;
import br.com.hospital.model.Atendimento;
import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.scene.control.Button;
	import javafx.scene.control.DatePicker;
	import javafx.scene.control.RadioButton;
	import javafx.scene.control.TextField;

	public class CadastroController {

	    @FXML
	    private TextField nome;

	    @FXML
	    private TextField cpf;

	    @FXML
	    private DatePicker date;

	    @FXML
	    private RadioButton cboAB;

	    @FXML
	    private RadioButton cboABnegativo;

	    @FXML
	    private RadioButton cboApositivo;

	    @FXML
	    private RadioButton cboAnegativo;

	    @FXML
	    private RadioButton cboB;

	    @FXML
	    private RadioButton cboOpositvo;

	    @FXML
	    private RadioButton cboOnegativo;

	    @FXML
	    private RadioButton cboMasculino;

	    @FXML
	    private RadioButton cboFeminino;

	    @FXML
	    private RadioButton cboSolteiro;

	    @FXML
	    private RadioButton cboCasado;

	    @FXML
	    private Button btnFinalizar;

	    @FXML
	    private Button btnCancelar;

	    @FXML
	    private Button btnVoltar;

	    @FXML
	    void CBOAB(ActionEvent event) {

	    }

	    @FXML
	    void btnCancelar(ActionEvent event) {

	    }

	    @FXML
	    void btnFinalizar(ActionEvent event) {
	    	String nomes = nome.getText();
	    	String cpfs = cpf.getText();
	    	String  data= date.getPromptText();
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
	    void cboABnegativo(ActionEvent event) {

	    }

	    @FXML
	    void cboAnegativo(ActionEvent event) {

	    }

	    @FXML
	    void cboApositivo(ActionEvent event) {

	    }

	    @FXML
	    void cboB(ActionEvent event) {

	    }

	    @FXML
	    void cboBnegativo(ActionEvent event) {

	    }

	    @FXML
	    void cboCasado(ActionEvent event) {

	    }

	    @FXML
	    void cboFeminino(ActionEvent event) {

	    }

	    @FXML
	    void cboMasculino(ActionEvent event) {

	    }

	    @FXML
	    void cboOnegativo(ActionEvent event) {

	    }

	    @FXML
	    void cboOpositivo(ActionEvent event) {

	    }

	    @FXML
	    void cboSolteiro(ActionEvent event) {

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


