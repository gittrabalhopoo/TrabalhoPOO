package fakedb;

import dominio.*;

public class TrabalhoFakeDB extends BaseFakeDB<Trabalho> {

    private DisciplinaFakeDB disciplinaFakeDB;

    @Override
    protected void CarregarDados() {
        this.disciplinaFakeDB = new DisciplinaFakeDB();

        // Obtém as disciplinas de DisciplinaFakeDB
        Disciplina disciplinaMatematica = this.disciplinaFakeDB.getById(1);
        Disciplina disciplinaPortugues = this.disciplinaFakeDB.getById(2);
        Disciplina disciplinaGeografia = this.disciplinaFakeDB.getById(3);
        Disciplina disciplinaHistoria = this.disciplinaFakeDB.getById(4);
        Disciplina disciplinaFisica = this.disciplinaFakeDB.getById(5);

        //Criando os Trabalhos.
        Trabalho trabalho1 = new Trabalho(1, disciplinaMatematica, "Trabalho de Matematica");
        Trabalho trabalho2 = new Trabalho(2, disciplinaPortugues, "Trabalho de Portugues");
        Trabalho trabalho3 = new Trabalho(3, disciplinaGeografia, "Trabalho de Geografia");
        Trabalho trabalho4 = new Trabalho(4, disciplinaHistoria, "Trabalho de Historia");
        Trabalho trabalho5 = new Trabalho(5, disciplinaFisica, "Trabalho de Fisica");

        // Adiciona os trabalhos à lista
        this.tabela.add(trabalho1);
        this.tabela.add(trabalho2);
        this.tabela.add(trabalho3);
        this.tabela.add(trabalho4);
        this.tabela.add(trabalho5);
    }

    public Trabalho getById(int id) {
        for (Trabalho trabalho : tabela) {
            if (trabalho.getCodigo() == id) {
                return trabalho;
            }
        }
        return null;
    }

    public TrabalhoFakeDB() {
        super();
    }
}