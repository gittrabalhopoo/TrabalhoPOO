package fakedb;

import dominio.Professor;
import java.util.Date;

public class ProfessorFakeDB extends BaseFakeDB<Professor> {
    @Override
    protected void CarregarDados() {
        // Cria instâncias de Professor
        Professor professor1 = new Professor(1, "Paulo", new Date(), "paulo", "senha123", "Professor");
        Professor professor2 = new Professor(2, "Sidney", new Date(), "maria", "senha456", "Professor");
        Professor professor3 = new Professor(3, "Simone", new Date(), "pedro", "senha789", "Professora");
        Professor professor4 = new Professor(4, "Noiza", new Date(), "ana", "senha101", "Professora");
        Professor professor5 = new Professor(5, "Andriane", new Date(), "lucas", "senha123", "Coordenadora");

        // Adiciona professores à lista
        this.tabela.add(professor1);
        this.tabela.add(professor2);
        this.tabela.add(professor3);
        this.tabela.add(professor4);
        this.tabela.add(professor5);  
    }

    public Professor getById(int id) {
        for (Professor professor : tabela) {
            if (professor.getCodigo() == id) {
                return professor;
            }
        }
        return null;
    }

    public ProfessorFakeDB() {
        super();
    }
}
