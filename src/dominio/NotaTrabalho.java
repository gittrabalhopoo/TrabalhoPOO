package dominio;

public class NotaTrabalho extends BaseDadosComum {
    private Aluno aluno;
    private Trabalho trabalho;
    private double nota;

    public NotaTrabalho(int codigo, Aluno aluno, Trabalho trabalho, double nota) {
        super(codigo);
        this.aluno = aluno;
        this.trabalho = trabalho;
        this.nota = nota;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Trabalho getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(Trabalho trabalho) {
        this.trabalho = trabalho;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
