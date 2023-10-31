package repositorio;

import dominio.Trabalho;
import fakedb.TrabalhoFakeDB;

public class TrabalhoRepositorio extends BaseRepositorioCRUD<TrabalhoFakeDB, Trabalho> {

    public TrabalhoRepositorio() {
        this.db = new TrabalhoFakeDB();
        this.dataset = this.db.getTabela();
    }

    @Override
    public Trabalho Create(Trabalho instancia) {
        int tamanho = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tamanho).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Trabalho Read(int codigo) {
        for (Trabalho trabalho : this.dataset) {
            if (trabalho.getCodigo() == codigo) {
                return trabalho;
            }
        }
        return null;
    }

    @Override
    public Trabalho Update(Trabalho instancia) {
        Trabalho alvo = this.Read(instancia.getCodigo());

        alvo.setCodigo(instancia.getCodigo());
        alvo.setDisciplina(instancia.getDisciplina());
        alvo.setDescricao(instancia.getDescricao());
        return alvo;
    }
    
    @Override
    public Trabalho Delete(int codigo) {
        Trabalho alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }
}
