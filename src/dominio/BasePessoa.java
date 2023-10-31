package dominio;

import java.util.Date;

public abstract class BasePessoa extends BaseDadosComum {
    protected String nome;
    protected Date dataNascimento;
    protected String usuario;
    protected String senha;

    public BasePessoa(int codigo, String nome, Date dataNascimento, String usuario, String senha) {
        super(codigo);
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}