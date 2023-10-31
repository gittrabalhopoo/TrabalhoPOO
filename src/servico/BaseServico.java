package servico;

import java.util.ArrayList;

public abstract class BaseServico <TRepo, TDominio> {
    protected TRepo repo;

    public abstract TDominio Inserir(TDominio tupla);
    public abstract TDominio Obter (int codigo);
    public abstract ArrayList<TDominio> Listar();
    public abstract TDominio Atualizar(TDominio tupla);
    public abstract TDominio Excluir(int codigo);

    public BaseServico(){}
}

