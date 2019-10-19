package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.hospital.DAO.MedicoDAO;
import br.com.hospital.conexao.Conexao;
import br.com.hospital.model.Medico;
import br.com.hospital.util.Rotas;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Main extends Application {

	static Stage stageAtual;
	static FXMLLoader loader;

	@Override
	public void start(Stage stage) throws IOException {
		stageAtual = stage;		
		loader = new FXMLLoader(getClass().getResource(Rotas.LOGIN));
		Parent root = loader.load();
			Scene scene = new Scene(root, 600, 400);
			scene.getStylesheets().add(getClass().getResource("/css/app.css").toExternalForm());
			stage.setScene(scene);
			stage.show();

	}	 
	public void openPage(String rota) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(rota));
		Parent root = loader.load();
			Scene scene = new Scene(loader.load());
			scene.getStylesheets().add(getClass().getResource("/css/app.css").toExternalForm());
			stageAtual.setScene(scene);
			stageAtual.show();
	}
	
	public Main() {
		
	}
	
	public static void main(String[] args) throws SQLException {
		launch(args);
		//MedicoDAO mDAO = new MedicoDAO();
		//Medico m = null;
		//mDAO.save(m);
		
}
}