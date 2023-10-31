package repositorio;

import dominio.RendimentoEscolar;
import fakedb.RendimentoEscolarFakeDB;

public class RendimentoEscolarRepositorio extends BaseRepositorioCRUD<RendimentoEscolarFakeDB, RendimentoEscolar> {
    public RendimentoEscolarRepositorio() {
        this.db = new RendimentoEscolarFakeDB();
        this.dataset = this.db.getTabela();
    }

    @Override
    public RendimentoEscolar Create(RendimentoEscolar instancia) {
        int tamanho = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tamanho).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public RendimentoEscolar Read(int codigo) {
        for (RendimentoEscolar rendimentoEscolar : this.dataset) {
            if (rendimentoEscolar.getCodigo() == codigo) {
                return rendimentoEscolar;
            }
        }
        return null;
    }

    @Override
    public RendimentoEscolar Update(RendimentoEscolar instancia) {
        RendimentoEscolar alvo = this.Read(instancia.getCodigo());

        alvo.setCodigo(instancia.getCodigo());
        alvo.setAluno(instancia.getAluno());
        alvo.setTurma(instancia.getTurma());
        alvo.setNota1prova(instancia.getNota1prova());
        alvo.setNota2prova(instancia.getNota2prova());
        alvo.setNotasTrabalho(instancia.getNotasTrabalho());
        alvo.setMediaTrabalhos(instancia.getMediaTrabalhos());
        alvo.setMediaGeral(instancia.getMediaGeral());
        return alvo;
    }

    @Override
    public RendimentoEscolar Delete(int codigo) {
        RendimentoEscolar alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
        
    }
}
