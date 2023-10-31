package fakedb;

import java.util.ArrayList;

import dominio.*;

public class RendimentoEscolarFakeDB extends BaseFakeDB<RendimentoEscolar> {
    private TurmaFakeDB turmaFakeDB;
    private AlunoFakeDB alunoFakeDB;

    @Override
    protected void CarregarDados() {
        this.turmaFakeDB = new TurmaFakeDB();
        this.alunoFakeDB = new AlunoFakeDB();

        // Obtém as turmas de TurmaFakeDB
        Turma turma1 = this.turmaFakeDB.getById(1);
        Turma turma2 = this.turmaFakeDB.getById(2);
        Turma turma3 = this.turmaFakeDB.getById(3);
        Turma turma4 = this.turmaFakeDB.getById(4);
        Turma turma5 = this.turmaFakeDB.getById(5);

        // Obtém os alunos de AlunoFakeDB
        Aluno aluno1 = this.alunoFakeDB.getById(1);
        Aluno aluno2 = this.alunoFakeDB.getById(2);
        Aluno aluno3 = this.alunoFakeDB.getById(3);
        Aluno aluno4 = this.alunoFakeDB.getById(4);
        Aluno aluno5 = this.alunoFakeDB.getById(5);

        // Cria instâncias de RendimentoEscolar
        RendimentoEscolar rendimentoEscolar1 = new RendimentoEscolar(1, aluno1, turma1, 8, 3,new ArrayList<NotaTrabalho>(), 7, 6.5);
        RendimentoEscolar rendimentoEscolar2 = new RendimentoEscolar(2, aluno2, turma2, 9, 4,new ArrayList<NotaTrabalho>(), 4.5, 5.1);
        RendimentoEscolar rendimentoEscolar3 = new RendimentoEscolar(3, aluno3, turma3, 10, 5,new ArrayList<NotaTrabalho>(), 4.75, 5.6);
        RendimentoEscolar rendimentoEscolar4 = new RendimentoEscolar(4, aluno4, turma4, 7, 2,new ArrayList<NotaTrabalho>(), 6, 5.5);
        RendimentoEscolar rendimentoEscolar5 = new RendimentoEscolar(5, aluno5, turma5, 9, 10,new ArrayList<NotaTrabalho>(), 8.25, 8.6);
        
        // Adiciona Rendimento Escolar à lista
        this.tabela.add(rendimentoEscolar1);
        this.tabela.add(rendimentoEscolar2);
        this.tabela.add(rendimentoEscolar3);
        this.tabela.add(rendimentoEscolar4);
        this.tabela.add(rendimentoEscolar5);
    }

    public RendimentoEscolarFakeDB() {
        super();
    }
}