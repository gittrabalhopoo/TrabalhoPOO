package servico;

import dominio.Trabalho;
import repositorio.TrabalhoRepositorio;
import java.util.ArrayList;

public class TrabalhoServico extends BaseServico<TrabalhoRepositorio, Trabalho> {

    public TrabalhoServico() {
        this.repo = new TrabalhoRepositorio();
    }

    @Override
    public Trabalho Inserir(Trabalho tupla) {
        return this.repo.Create(tupla);
    }

    @Override
    public Trabalho Obter(int codigo) {
        return this.repo.Read(codigo);
    }
    
    @Override
    public ArrayList<Trabalho> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public Trabalho Atualizar(Trabalho tupla) {
        return this.repo.Update(tupla);
    }

    @Override
    public Trabalho Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }
}
