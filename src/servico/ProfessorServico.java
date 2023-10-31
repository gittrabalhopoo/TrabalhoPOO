package servico;

import dominio.Professor;
import repositorio.ProfessorRepositorio;
import java.util.ArrayList;

public class ProfessorServico extends BaseServico<ProfessorRepositorio, Professor> {

    public ProfessorServico() {
        this.repo = new ProfessorRepositorio();
    }

    @Override
    public Professor Inserir(Professor tupla) {
        return this.repo.Create(tupla);
    }

    @Override
    public Professor Obter(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Professor> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public Professor Atualizar(Professor tupla) {
        return this.repo.Update(tupla);
    }
    
    @Override
    public Professor Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }
}
