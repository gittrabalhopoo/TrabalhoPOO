package dominio;

public class Disciplina extends BaseDadosComum{
    private String nome;
    private String ementa;

    public Disciplina(int codigo, String nome, String ementa){
        super(codigo);
        this.nome = nome;
        this.ementa = ementa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }
}
