package repositorio;

import dominio.Disciplina;
import fakedb.DisciplinaFakeDB;

public class DisciplinaRepositorio extends BaseRepositorioCRUD<DisciplinaFakeDB, Disciplina> {

    //Construtor
    public DisciplinaRepositorio() {
        this.db = new DisciplinaFakeDB(); // Inicia o atributo db com uma instância de AlunoFakeDB
        this.dataset = this.db.getTabela(); // Inicia o atributo dataset com a tabela de alunos do banco de dados.
    }

    @Override
    public Disciplina Create(Disciplina instancia) {
        int tamanho = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tamanho).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Disciplina Read(int codigo) {
        for (Disciplina disciplina : this.dataset) {
            if (disciplina.getCodigo() == codigo) {
                return disciplina;
            }
        }
        return null;
    }

    @Override
    public Disciplina Update(Disciplina instancia) {
        Disciplina alvo = this.Read(instancia.getCodigo());

        alvo.setCodigo(instancia.getCodigo());
        alvo.setNome(instancia.getNome());
        alvo.setEmenta(instancia.getEmenta());
        return alvo;
    }

    @Override
    public Disciplina Delete(int codigo) {
        Disciplina alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }
}
