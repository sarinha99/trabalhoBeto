package br.com.hospital.controller;

import br.com.hospital.DAO.AtendimentoDAO;
import br.com.hospital.model.Atendimento;

public class AtendimentoController {

	@FXML
    private Button btnFinalizar;

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnVoltar;

    @FXML
    private TableView<?> listaAtendimento;

    @FXML
    private TextArea txtComentarioEnfermeiro;

    @FXML
    private TextArea txtComentarioMedico;

    @FXML
    private TableColumn<?, ?> peso;

    @FXML
    private TableColumn<?, ?> altura;

    @FXML
    private DatePicker date;

    @FXML
    private TextField txtDoenca;

    @FXML
    private ImageView comentarioEnfer;

    @FXML
    private TableColumn<?, ?> comentarioMedico;

    @FXML
    private TableColumn<?, ?> doenca;

    @FXML
    private TableColumn<?, ?> Data;

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnExcluir;

    @FXML
    private Button btnAtualizar;
    
    @FXML
    void btnCancelar(ActionEvent event) {

    }

    @FXML
    void btnFinalizar(ActionEvent event)  {
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


}
