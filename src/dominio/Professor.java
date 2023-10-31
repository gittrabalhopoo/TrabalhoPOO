package dominio;

import java.util.Date;

public class Professor extends BasePessoa {
    private String cargo;

    public Professor(int codigo, String nome, Date dataNascimento, String usuario, String senha, String cargo) {
        super(codigo, nome, dataNascimento, usuario, senha);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
