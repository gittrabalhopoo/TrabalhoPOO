package fakedb;

import dominio.*;

public class TurmaFakeDB extends BaseFakeDB<Turma> {
    private DisciplinaFakeDB disciplinaFakeDB;
    private ProfessorFakeDB professorFakeDB;

    @Override
    protected void CarregarDados() {
        this.disciplinaFakeDB = new DisciplinaFakeDB();
        this.professorFakeDB = new ProfessorFakeDB();

        // Obtém as disciplinas de DisciplinaFakeDB
        Disciplina disciplinaMatematica = this.disciplinaFakeDB.getById(1);
        Disciplina disciplinaPortugues = this.disciplinaFakeDB.getById(2);
        Disciplina disciplinaGeografia = this.disciplinaFakeDB.getById(3);
        Disciplina disciplinaHistoria = this.disciplinaFakeDB.getById(4);
        Disciplina disciplinaFisica = this.disciplinaFakeDB.getById(5);

        // Obtém os professores de ProfessorFakeDB
        Professor professor1 = this.professorFakeDB.getById(1);
        Professor professor2 = this.professorFakeDB.getById(2);
        Professor professor3= this.professorFakeDB.getById(3);
        Professor professor4 = this.professorFakeDB.getById(4);
        Professor professor5 = this.professorFakeDB.getById(5);

        //Criando as turmas.
        Turma turma1 = new Turma(1, disciplinaMatematica, professor1, 10);
        Turma turma2 = new Turma(2, disciplinaPortugues, professor2, 20);
        Turma turma3 = new Turma(3, disciplinaFisica, professor3, 30);
        Turma turma4 = new Turma(4, disciplinaGeografia, professor4, 40);
        Turma turma5 = new Turma(5, disciplinaHistoria, professor5, 50);
        this.tabela.add(turma1);
        this.tabela.add(turma2);
        this.tabela.add(turma3);
        this.tabela.add(turma4);
        this.tabela.add(turma5);
    }

    public Turma getById(int id) {
        for (Turma turma : tabela) {
            if (turma.getCodigo() == id) {
                return turma;
            }
        }
        return null;
    }

    public TurmaFakeDB() {
        super();
    }
}
