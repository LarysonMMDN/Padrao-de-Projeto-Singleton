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

    private String telaAtual = "TelaPrincipal.fxml";

    @Override
    public void start(Stage primaryStage) throws Exception{
        Navegacao.trocarTela("/view/" + telaAtual, primaryStage);

    }

    @FXML
    public void abrirTelaCadastro() throws IOException {
        Stage stage = (Stage) bntCadastro.getScene().getWindow();
        telaAtual = "TelaCadastro.fxml";
        Navegacao.trocarTela("/view/" + telaAtual, stage);
    }

    @FXML
    public void abrirTelaExibicao() throws IOException {
        Stage stage = (Stage) bntCadastro.getScene().getWindow();
        telaAtual = "TelaExibicao.fxml";
        Navegacao.trocarTela("/view/" + telaAtual, stage);
    }

    static void Main(String args) {
        launch(args);

    }
}
