package repositorio;

import java.util.ArrayList;

// CRUD = Create, Read, Update, Delete.
public abstract class BaseRepositorioCRUD<TFakeDB, TDominio> {

    protected TFakeDB db; // Atributo para simular um banco de dados
    protected ArrayList<TDominio> dataset; // Atributo para armazenar os objetos do tipo TDominio

    // Método abstrato para criar um novo registro no repositório
    public abstract TDominio Create(TDominio instancia);

    // Método abstrato para ler um registro do repositório pelo código
    public abstract TDominio Read(int codigo);

    // Método para ler todos os registros do repositório
    public ArrayList<TDominio> ReadAll() {
        return this.dataset;
    }

    // Método abstrato para atualizar um registro existente no repositório
    public abstract TDominio Update(TDominio instancia);

    // Método abstrato para excluir um registro do repositório pelo código
    public abstract TDominio Delete(int codigo);
}