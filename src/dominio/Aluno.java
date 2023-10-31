package dominio;

import java.util.Date;

public class Aluno extends BasePessoa {
    private String periodo;

    public Aluno(int codigo, String nome, Date dataNascimento, String usuario, String senha, String periodo) {
        super(codigo, nome, dataNascimento, usuario, senha);
        this.periodo = periodo;
    }
    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
