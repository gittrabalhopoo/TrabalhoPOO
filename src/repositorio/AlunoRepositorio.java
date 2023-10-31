package repositorio;

import dominio.Aluno;
import fakedb.AlunoFakeDB;

public class AlunoRepositorio extends BaseRepositorioCRUD<AlunoFakeDB, Aluno> {

    //Construtor
    public AlunoRepositorio() {
        this.db = new AlunoFakeDB(); // Inicia o atributo db com uma instância de AlunoFakeDB
        this.dataset = this.db.getTabela(); // Inicia o atributo dataset com a tabela de alunos do banco de dados.
    }   
    
    @Override
    public Aluno Create(Aluno instancia) {
        int tamanho = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tamanho).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Aluno Read(int codigo) {
        for (Aluno aluno : this.dataset) {
            if (aluno.getCodigo() == codigo) {
                return aluno;
            }
        }
        return null;
    }

    @Override
    public Aluno Update(Aluno instancia) {
        Aluno alvo = this.Read(instancia.getCodigo());

        alvo.setCodigo(instancia.getCodigo());
        alvo.setNome(instancia.getNome());
        alvo.setDataNascimento(instancia.getDataNascimento());
        alvo.setPeriodo(instancia.getPeriodo());
        alvo.setUsuario(instancia.getUsuario());
        alvo.setSenha(instancia.getSenha());
        return alvo;
    }

    @Override
    public Aluno Delete(int codigo) {
        Aluno alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }
}