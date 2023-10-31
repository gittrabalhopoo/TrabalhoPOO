package dominio;

import java.util.List;

public class RendimentoEscolar extends BaseDadosComum {
    private Aluno aluno;
    private Turma turma;
    private double nota1prova;
    private double nota2prova;
    private List<NotaTrabalho> notasTrabalho;
    private double mediaTrabalhos;
    private double mediaGeral;

    public RendimentoEscolar(int codigo, Aluno aluno, Turma turma, double nota1prova, double nota2prova, List<NotaTrabalho> notasTrabalho, double mediaTrabalhos, double mediaGeral) {
        super(codigo);
        this.codigo = codigo;
        this.aluno = aluno;
        this.turma = turma;
        this.nota1prova = nota1prova;
        this.nota2prova = nota2prova;
        this.notasTrabalho = notasTrabalho;
        this.mediaGeral = mediaGeral;
        this.mediaTrabalhos = mediaTrabalhos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public double getNota1prova() {
        return nota1prova;
    }

    public void setNota1prova(double nota1prova) {
        this.nota1prova = nota1prova;
    }

    public double getNota2prova() {
        return nota2prova;
    }

    public void setNota2prova(double nota2prova) {
        this.nota2prova = nota2prova;
    }

    public List<NotaTrabalho> getNotasTrabalho() {
        return notasTrabalho;
    }

    public void setNotasTrabalho(List<NotaTrabalho> notasTrabalho) {
        this.notasTrabalho = notasTrabalho;
    }

    public double getMediaTrabalhos() {
        return mediaTrabalhos;
    }

    public void setMediaTrabalhos(double mediaTrabalhos) {
        this.mediaTrabalhos = mediaTrabalhos;
    }

    public double getMediaGeral() {
        return mediaGeral;
    }

    public void setMediaGeral(double mediaGeral) {
        this.mediaGeral = mediaGeral;
    }
}
