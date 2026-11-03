package laryson.martins;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ApplicationMain extends Application {
    @FXML
    private Button bntCadastro;
    @FXML
    private Button bntVisualizarCadastro;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Navegacao.trocarTela("/view/TelaPrincipal.fxml", primaryStage);

    }

    @FXML
    public void abrirTelaCadastro() throws IOException {
        Stage stage = (Stage) bntCadastro.getScene().getWindow();
        Navegacao.trocarTela("/view/TelaCadastro.fxml", stage);
    }

    @FXML
    public void abrirTelaExibicao() throws IOException {
        Stage stage = (Stage) bntCadastro.getScene().getWindow();
        Navegacao.trocarTela("/view/TelaExibicao.fxml", stage);
    }

    static void Main(String args) {
        launch(args);

    }
}
