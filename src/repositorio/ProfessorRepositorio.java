package repositorio;

import dominio.Professor;
import fakedb.ProfessorFakeDB;

public class ProfessorRepositorio extends BaseRepositorioCRUD<ProfessorFakeDB, Professor> {
    public ProfessorRepositorio() {
        this.db = new ProfessorFakeDB();
        this.dataset = this.db.getTabela();
    }
    
    @Override
    public Professor Create(Professor instancia) {
        int tamanho = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tamanho).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Professor Read(int codigo) {
        for (Professor professor : this.dataset) {
            if (professor.getCodigo() == codigo) {
                return professor;
            }
        }
        return null;
    }

    @Override
    public Professor Update(Professor instancia) {
        Professor alvo = this.Read(instancia.getCodigo());
        
        alvo.setCodigo(instancia.getCodigo());
        alvo.setNome(instancia.getNome());
        alvo.setCargo(instancia.getCargo());
        alvo.setDataNascimento(instancia.getDataNascimento());
        alvo.setUsuario(instancia.getUsuario());
        alvo.setSenha(instancia.getSenha());
        return alvo;
    }

    @Override
    public Professor Delete(int codigo) {
        Professor alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }
}
