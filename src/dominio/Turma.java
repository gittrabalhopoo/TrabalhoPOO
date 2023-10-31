package dominio;

public class Turma extends BaseDadosComum {
    private Disciplina disciplina;
    private Professor professor;
    private int capacidadeTurma;

    public Turma(int codigo, Disciplina disciplina, Professor professor, int capacidadeTurma) {
        super(codigo);
        this.disciplina = disciplina;
        this.professor = professor;
        this.capacidadeTurma = capacidadeTurma;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getCapacidadeTurma() {
        return capacidadeTurma;
    }

    public void setCapacidadeTurma(int capacidadeTurma) {
        this.capacidadeTurma = capacidadeTurma;
    }
}
