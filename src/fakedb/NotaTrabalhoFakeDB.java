package fakedb;

import dominio.*;

public class NotaTrabalhoFakeDB extends BaseFakeDB<NotaTrabalho> {
    private AlunoFakeDB alunoFakeDB;
    private TrabalhoFakeDB trabalhoFakeDB;

    @Override
    protected void CarregarDados() {                    
        this.alunoFakeDB = new AlunoFakeDB(); // Cria uma instância de AlunoFakeDB
        this.trabalhoFakeDB = new TrabalhoFakeDB(); // Cria uma instância de TrabalhoFakeDB

        // Obtém os alunos de AlunoFakeDB
        Aluno aluno1 = this.alunoFakeDB.getById(1);
        Aluno aluno2 = this.alunoFakeDB.getById(2);
        Aluno aluno3 = this.alunoFakeDB.getById(3);
        Aluno aluno4 = this.alunoFakeDB.getById(4);
        Aluno aluno5 = this.alunoFakeDB.getById(5);

        // Obtém as disciplinas de TrabalhoFakeDB
        Trabalho trabalho1 = this.trabalhoFakeDB.getById(1);
        Trabalho trabalho2 = this.trabalhoFakeDB.getById(2);
        Trabalho trabalho3 = this.trabalhoFakeDB.getById(3);
        Trabalho trabalho4 = this.trabalhoFakeDB.getById(4);

        // Adiciona notas de trabalho à lista
        this.tabela.add(new NotaTrabalho(1, aluno1, trabalho1, 9));
        this.tabela.add(new NotaTrabalho(2, aluno1, trabalho2, 3));
        this.tabela.add(new NotaTrabalho(3, aluno1, trabalho3, 9));
        this.tabela.add(new NotaTrabalho(4, aluno1, trabalho4, 7));
        this.tabela.add(new NotaTrabalho(5, aluno2, trabalho1, 8));
        this.tabela.add(new NotaTrabalho(6, aluno2, trabalho2, 2));
        this.tabela.add(new NotaTrabalho(7, aluno2, trabalho3, 3));
        this.tabela.add(new NotaTrabalho(8, aluno2, trabalho4, 5));
        this.tabela.add(new NotaTrabalho(9, aluno3, trabalho1, 7));
        this.tabela.add(new NotaTrabalho(10, aluno3, trabalho2, 7));
        this.tabela.add(new NotaTrabalho(11, aluno3, trabalho3, 0));
        this.tabela.add(new NotaTrabalho(12, aluno3, trabalho4, 5));
        this.tabela.add(new NotaTrabalho(13, aluno4, trabalho1, 6));
        this.tabela.add(new NotaTrabalho(14, aluno4, trabalho2, 10));
        this.tabela.add(new NotaTrabalho(15, aluno4, trabalho3, 6));
        this.tabela.add(new NotaTrabalho(16, aluno4, trabalho4, 2));
        this.tabela.add(new NotaTrabalho(17, aluno5, trabalho1, 9));
        this.tabela.add(new NotaTrabalho(18, aluno5, trabalho2, 6));
        this.tabela.add(new NotaTrabalho(19, aluno5, trabalho3, 8));
        this.tabela.add(new NotaTrabalho(20, aluno5, trabalho4, 10));
    }

    public NotaTrabalhoFakeDB() {
        super();
    }
}