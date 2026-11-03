package laryson.martins.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import laryson.martins.Navegacao;
import laryson.martins.model.Pessoa;

import javafx.scene.image.ImageView;
import java.io.File;
import java.io.IOException;

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
        if (pessoa.getNome() != null){
            String sexo = "Não informado";
            if (pessoa.getSexo() == 'M'){
                sexo = "Masculino";
            } else if (pessoa.getSexo() == 'F'){
                sexo = "Feminino";
            }
            tfNome.setText(pessoa.getNome());
            dpDataNascimento.setValue(pessoa.getDataNascimento());
            cbSexo.setValue(sexo);
            tfTelefone.setText(pessoa.getTelefone());
            cbEstadoCivil.setValue(pessoa.getEstadoCivil());
            imgPerfil.setImage(pessoa.getImagem());
        }
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
    @FXML
    public void bntVoltarTelaPrincipal() throws IOException {
        Stage stage = (Stage) tfNome.getScene().getWindow();
        Navegacao.trocarTela("/view/TelaPrincipal.fxml", stage);
    }

}
