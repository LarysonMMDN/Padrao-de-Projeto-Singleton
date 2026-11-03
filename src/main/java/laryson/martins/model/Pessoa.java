package laryson.martins.model;

import javafx.scene.image.Image;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private char sexo;
    private String telefone;
    private String estadoCivil;
    private Image imagem;
    private static Pessoa pessoa;

    private Pessoa() {
    }

    private Pessoa(String nome, LocalDate dataNascimento, char sexo, String telefone, String estadoCivil, Image imagem) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.telefone = telefone;
        this.estadoCivil = estadoCivil;
        this.imagem = imagem;
    }

    public static Pessoa getPessoa(){
        if (pessoa == null) {
            return pessoa = new Pessoa();
        }

        return pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setCadastro(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Image getImagem() {
        return imagem;
    }

    public void setImagem(Image imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", sexo=" + sexo +
                ", telefone='" + telefone + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", imagem=" + imagem +
                '}';
    }
}
