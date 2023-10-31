package fakedb;

import java.util.ArrayList;

public abstract class BaseFakeDB<TDominio> {
    protected ArrayList<TDominio> tabela;

    public ArrayList<TDominio> getTabela() {
        if (this.tabela == null) {
            this.tabela = new ArrayList<>();
        }
        return this.tabela;
    }

    protected abstract void CarregarDados();

    public BaseFakeDB() {
        this.tabela = new ArrayList<TDominio>();
        this.CarregarDados();
    }
}
