package laryson.martins;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ApplicationMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent tela = FXMLLoader.load(getClass().getResource("/view/TelaCadastro.fxml"));
        primaryStage.setTitle("Primeira tela");
        primaryStage.setScene( new Scene(tela, 600, 400));
        primaryStage.show();

    }
    static void Main(String args) {
        launch(args);

    }
}
