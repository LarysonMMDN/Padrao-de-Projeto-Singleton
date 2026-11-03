package laryson.martins.controller;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import laryson.martins.Navegacao;
import laryson.martins.model.Pessoa;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

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
        String nome;
        if (pessoa.getNome().length() == 0) {
            nome = "Não Informado";
        } else {
            nome = pessoa.getNome();
        }
        // Formatando a idade
        String data;
        LocalDate nascimento = pessoa.getDataNascimento();
        if (nascimento == null){
            data = "Não Infomado";
        } else {
            int idade = Period.between(nascimento, LocalDate.now()).getYears();
            data = nascimento.format(
                    DateTimeFormatter.ofPattern("dd/MM/yyyy")
            ) + " - " + idade + " anos";
        }
        // Sexo
        String sexo = "Não informado";
        if (pessoa.getSexo() == 'M'){
            sexo = "Masculino";
        } else if (pessoa.getSexo() == 'F'){
            sexo = "Feminino";
        }

        // Telefone
        String telefone;
        if (pessoa.getTelefone().length() == 0) {
            telefone = "Não informado";
        } else {
            telefone = pessoa.getTelefone();
        }

        // Estado Civil
        String estadoCivil;
        if (pessoa.getEstadoCivil() == null) {
            estadoCivil = "Não Informado";
        } else {
            estadoCivil = pessoa.getEstadoCivil();
        }
        // Imagem
        if (pessoa.getImagem() != null) {
            imagemExibicao.setImage(pessoa.getImagem());
        }

        nomeExibicao.setText(nome);
        dataNascimentoExibicao.setText(data);
        sexoExibicao.setText(sexo);
        telefoneExibicao.setText(telefone);
        estadoCivilExibicao.setText(estadoCivil);
    }
    @FXML
    public void bntVoltarTelaPrincipal() throws IOException {
        Stage stage = (Stage) nomeExibicao.getScene().getWindow();
        Navegacao.trocarTela("/view/TelaPrincipal.fxml", stage);
    }
    @FXML
    public void bntTelaCadastro() throws IOException {
        Stage stage = (Stage) nomeExibicao.getScene().getWindow();
        Navegacao.trocarTela("/view/TelaCadastro.fxml", stage);
    }

}
