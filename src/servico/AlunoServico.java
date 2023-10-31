package servico;

import dominio.Aluno;
import repositorio.AlunoRepositorio;
import java.util.ArrayList;

public class AlunoServico extends BaseServico<AlunoRepositorio, Aluno>{

    public AlunoServico() {
        this.repo = new AlunoRepositorio();
    }

    @Override
    public Aluno Inserir(Aluno tupla) {
        return this.repo.Create(tupla);
    }    

    @Override
    public Aluno Obter(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Aluno> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public Aluno Atualizar(Aluno tupla) {
        return this.repo.Update(tupla);
    }

    @Override
    public Aluno Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }
}
