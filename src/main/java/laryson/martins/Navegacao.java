package laryson.martins;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Navegacao {
    public static void trocarTela(String caminho, Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(Navegacao.class.getResource(caminho));

        Parent tela = loader.load();
        stage.setTitle("Singleton");
        stage.setScene( new Scene(tela, 600, 400));
        stage.show();
    }
}
