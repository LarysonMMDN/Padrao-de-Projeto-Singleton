package laryson.martins.controller;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import laryson.martins.model.Pessoa;

public class ExibicaoController {
    @FXML
    private Label nomeExibicao;
    @FXML
    private Label dataNascimentoExibicao;
    @FXML
    private Label telefoneExibicao;
    @FXML
    private Label sexoExibicao;
    @FXML
    private Label estadoCivilExibicao;
    @FXML
    private ImageView imagemExibicao;
    Pessoa pessoa = Pessoa.getPessoa();

    @FXML
    public void initialize(){
        if (pessoa.getNome() != null){
            nomeExibicao.setText(pessoa.getNome());
            dataNascimentoExibicao.setText("Pendente");
            telefoneExibicao.setText(pessoa.getTelefone());
            estadoCivilExibicao.setText(pessoa.getEstadoCivil());
            imagemExibicao.setImage(pessoa.getImagem());
        }

    }
}
