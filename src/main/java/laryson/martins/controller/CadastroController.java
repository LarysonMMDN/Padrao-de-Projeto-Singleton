package laryson.martins.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;
import laryson.martins.model.Pessoa;

import javafx.scene.image.ImageView;
import java.io.File;

public class CadastroController {
    @FXML
    private TextField tfNome;
    @FXML
    private DatePicker dpDataNascimento;
    @FXML
    private ComboBox<String> cbSexo;
    @FXML
    private TextField tfTelefone;
    @FXML
    private ComboBox<String> cbEstadoCivil;
    @FXML
    private ImageView imgPerfil;

    Pessoa pessoa = Pessoa.getPessoa();

    @FXML
    public void initialize() {
        System.out.println("Controller inicializado!");
        cbSexo.getItems().addAll("Masculino", "Feminino");
        cbEstadoCivil.getItems().addAll(
                "Solteiro(a)", "Casado(a)", "Divorciado(a)",
                "Viúvo(a)", "Separado(a)", "União estável",
                "Desquitado(a)", "Companheiro(a)", "Outro");
    }
    @FXML
    private void selecionarImagem() {

        FileChooser fileChooser = new FileChooser();

        fileChooser.setTitle("Selecionar imagem");

        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter(
                        "Imagens", "*.png", "*.jpg", "*.jpeg"
                )
        );

        File arquivo = fileChooser.showOpenDialog(
                imgPerfil.getScene().getWindow()
        );

        if (arquivo != null) {
            Image imagem = new Image(arquivo.toURI().toString());
            imgPerfil.setImage(imagem);
            pessoa.setImagem(imagem);
        }
    }

    @FXML
    public void SalvarDados(){
        char sexo;
        if (cbSexo.getValue() == "Masculino"){
            sexo = 'M';
        } else {
            sexo = 'F';
        }


        pessoa.setNome(tfNome.getText());
        pessoa.setDataNascimento(dpDataNascimento.getValue());
        pessoa.setSexo(sexo);
        pessoa.setTelefone(tfTelefone.getText());
        pessoa.setEstadoCivil(cbEstadoCivil.getValue());
        System.out.println(pessoa);
    }

}
