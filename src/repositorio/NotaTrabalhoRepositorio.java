package repositorio;

import dominio.NotaTrabalho;
import fakedb.NotaTrabalhoFakeDB;

public class NotaTrabalhoRepositorio extends BaseRepositorioCRUD<NotaTrabalhoFakeDB, NotaTrabalho> {

    public NotaTrabalhoRepositorio() {
        this.db = new NotaTrabalhoFakeDB();
        this.dataset = this.db.getTabela();
    }
    
    @Override
    public NotaTrabalho Create(NotaTrabalho instancia) {
        int tamanho = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tamanho).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public NotaTrabalho Read(int codigo) {
        for (NotaTrabalho notaTrabalho : this.dataset) {
            if (notaTrabalho.getCodigo() == codigo) {
                return notaTrabalho;
            }
        }
        return null;
    }

    @Override
    public NotaTrabalho Update(NotaTrabalho instancia) {
        NotaTrabalho alvo = this.Read(instancia.getCodigo());

        alvo.setCodigo(instancia.getCodigo());
        alvo.setAluno(instancia.getAluno());
        alvo.setTrabalho(instancia.getTrabalho());
        alvo.setNota(instancia.getNota());
        return alvo;
    }

    @Override
    public NotaTrabalho Delete(int codigo) {
        NotaTrabalho alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }
}
