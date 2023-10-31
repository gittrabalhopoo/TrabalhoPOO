package dominio;

public abstract class BaseDadosComum {
    protected int codigo;

    public BaseDadosComum(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
