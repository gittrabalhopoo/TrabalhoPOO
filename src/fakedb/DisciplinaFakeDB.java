package fakedb;

import dominio.Disciplina;

public class DisciplinaFakeDB extends BaseFakeDB<Disciplina> {
    // Método para carregar dados na tabela
    @Override
    protected void CarregarDados() {
         // Cria objetos Disciplina e atribui a variáveis
         Disciplina disciplinaMatematica = new Disciplina(1, "Matematica", "Matematica");
         Disciplina disciplinaPortugues = new Disciplina(2, "Portugues", "Portugues");
         Disciplina disciplinaGeografia = new Disciplina(3, "Geografia", "Geografia");
         Disciplina disciplinaHistoria = new Disciplina(4, "Historia", "Historia");
         Disciplina disciplinaFisica = new Disciplina(5, "Fisica", "Fisica");
         Disciplina disciplinaQuimica = new Disciplina(6, "Quimica", "Quimica");
         Disciplina disciplinaIngles = new Disciplina(7, "Ingles", "Ingles");
 
         tabela.add(disciplinaMatematica);
         tabela.add(disciplinaPortugues);
         tabela.add(disciplinaGeografia);
         tabela.add(disciplinaHistoria);
         tabela.add(disciplinaFisica);
         tabela.add(disciplinaQuimica);
         tabela.add(disciplinaIngles);
    }

    // Construtor da classe DisciplinaFakeDB
    public DisciplinaFakeDB() {
        // Chama o construtor da classe base para inicializar a tabela de objetos e carregar os dados
        super();
    }
    // Método getById para obter uma disciplina pelo ID
    public Disciplina getById(int id) {
        for (Disciplina disciplina : tabela) {
            if (disciplina.getCodigo() == id) {
                return disciplina;
            }
        }
        return null;
    }
}