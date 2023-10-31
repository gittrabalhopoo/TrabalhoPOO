package fakedb;

import java.util.Date;

import dominio.*;

public class AlunoFakeDB extends BaseFakeDB<Aluno> {
    
    @Override
    protected void CarregarDados()  {
        //Criando os alunos.
        Aluno aluno1 = new Aluno(1, "Rodrigo", new Date(), "Rodrigo", "123", "Matutino");
        Aluno aluno2 = new Aluno(2, "Pedro", new Date(), "Pedro", "1234", "Vespertino");
        Aluno aluno3 = new Aluno(3, "Ana", new Date(), "Ana", "1235", "Noturno");
        Aluno aluno4 = new Aluno(4, "Laura", new Date(), "Laura", "1236", "Matutino");
        Aluno aluno5 = new Aluno(5, "Danilo", new Date(), "Danilo\"", "1237", "Noturno");

        // Adiciona os alunos à lista
        this.tabela.add(aluno1);
        this.tabela.add(aluno2);
        this.tabela.add(aluno3);
        this.tabela.add(aluno4);
        this.tabela.add(aluno5);
    }

    public AlunoFakeDB() {
        super();
    }

    public Aluno getById(int id) {
        for (Aluno aluno : tabela) {
            if (aluno.getCodigo() == id) {
                return aluno;
            }
        }
        return null;
    }
}
