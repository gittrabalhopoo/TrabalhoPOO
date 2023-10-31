import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dominio.*;
import servico.*;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenuPrincipal();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do professor (de 1 a 5): ");
                    int idProfessor = scanner.nextInt();
                    menuProfessor(idProfessor);
                    break;
                case 2:
                    System.out.print("Digite o ID do aluno (de 1 a 5): ");
                    int idAluno = scanner.nextInt();
                    menuAluno(idAluno);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, selecione novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void exibirMenuPrincipal() {
        System.out.println("----- Menu Principal -----");
        System.out.println("1. Menu do Professor");
        System.out.println("2. Menu do Aluno");
        System.out.println("0. Encerrar o programa");
        System.out.print("Selecione uma opção: ");
    }

    public static void menuProfessor(int idProfessor) {
        int opcao;

        do {
            exibirMenuProfessor(idProfessor);
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    // Listar todas as turmas disponiveis.
                    System.out.println("Listando todas as turmas disponíveis...");
                    TurmaServico turmaServico = new TurmaServico();
                    List<Turma> turmas = turmaServico.Listar();
                    System.out.println("Lista de turmas deste professor:");
                    for (Turma turma : turmas) {
                        System.out.println(turma.getCodigo() + ". Turma" + turma.getCodigo());
                    }
                    // Pedir ao usuário para selecionar uma turma por ID.
                    System.out.print("Selecione uma turma por ID: ");
                    int idTurmaSelecionada = scanner.nextInt();
                    scanner.nextLine(); // Consume o caractere de nova linha do buffer.

                    // Abrir o menuProfessor11 com a turma selecionada.
                    Turma turmaSelecionada = null;
                    for (Turma turma : turmas) {
                        if (turma.getCodigo() == idTurmaSelecionada) {
                            turmaSelecionada = turma;
                            break;
                        }
                    }
                    if (turmaSelecionada != null) {
                        menuProfessor11(turmaSelecionada);
                    } else {
                        System.out.println("Turma não encontrada. Por favor, selecione novamente.");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, selecione novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    public static void exibirMenuProfessor(int idProfessor) {
        System.out.println("----- Menu do Professor (" + idProfessor + ") -----");
        System.out.println("1. Listar turmas");
        System.out.println("0. Voltar ao menu anterior");
        System.out.print("Selecione uma opção: ");
    }

    public static void menuProfessor11(Turma turmaSelecionada) {
        int opcao;

        do {
            exibirMenuProfessor11(turmaSelecionada);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Listando os alunos da turma...");
                    AlunoServico alunoServico = new AlunoServico();
                    ArrayList<Aluno> alunos = alunoServico.Listar();
                    for (int i = 0; i < alunos.size(); i++) {
                        Aluno aluno = alunos.get(i);
                        System.out.println((i+1) + ". Aluno/a: " + aluno.getNome());
                    }

                    // Pedir ao usuário para selecionar um aluno por ID.
                    System.out.print("Selecione um aluno por ID: ");
                    int idAlunoSelecionado = scanner.nextInt();
                    scanner.nextLine(); // Consume o caractere de nova linha do buffer.

                    // Buscar o aluno selecionado na lista de alunos.
                    Aluno alunoSelecionado = null;
                    for (Aluno aluno : alunos) {
                        if (aluno.getCodigo() == idAlunoSelecionado) {
                            alunoSelecionado = aluno;
                            break;
                        }
                    }
                    if (alunoSelecionado != null) {
                        menuProfessor12(alunoSelecionado);
                    } else {
                        System.out.println("Aluno não encontrado. Por favor, selecione novamente.");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, selecione novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    public static void exibirMenuProfessor11(Turma turmaSelecionada) {
        System.out.println("----- Menu do Professor 1.1 (" + turmaSelecionada + ") -----");
        System.out.println("1. Listar alunos");
        System.out.println("0. Voltar ao menu anterior");
        System.out.print("Selecione uma opção: ");
    }

    public static void menuProfessor12(Aluno alunoSelecionado) {
        int opcao;

        do {
            exibirMenuProfessor12(alunoSelecionado);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Exibindo as notas do aluno " + alunoSelecionado.getCodigo() + "...");
                    NotaTrabalhoServico notaTrabalhoServico = new NotaTrabalhoServico();
                    ArrayList<NotaTrabalho> notas = notaTrabalhoServico.Listar();
                    for (NotaTrabalho notaTrabalho : notas) {
                        if (notaTrabalho.getAluno().getCodigo() == alunoSelecionado.getCodigo()) {
                            System.out.println("Trabalho " + notaTrabalho.getTrabalho().getCodigo() + " - Nota: " + notaTrabalho.getNota());
                        }
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, selecione novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    public static void exibirMenuProfessor12(Aluno alunoSelecionado) {
        System.out.println("----- Menu do Professor 1.2 (" + alunoSelecionado + ") -----");
        System.out.println("1. Exibir notas do aluno");
        System.out.println("0. Voltar ao menu anterior");
        System.out.print("Selecione uma opção: ");
    }

    public static void menuAluno(int idAluno) {
        int opcao;

        do {
            exibirMenuAluno(idAluno);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informando a turma em que o aluno está matriculado...");
                    TurmaServico turmaServico = new TurmaServico();
                    Turma turma = turmaServico.Obter(idAluno);
                    if (turma != null) {
                        System.out.println("\nAluno está matriculado na Turma" + turma.getCodigo());
                        System.out.println("- Codigo: " + turma.getCodigo()  + "\n- Disciplina: " + turma.getDisciplina().getNome() + "\n- Professor/a: " + turma.getProfessor().getNome() + "\n- Capacidade da turma: " + turma.getCapacidadeTurma());
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 2:
                    System.out.println("Exibindo as disciplinas do aluno...");
                    DisciplinaServico disciplinaServico = new DisciplinaServico();
                    ArrayList<Disciplina> disciplinas = disciplinaServico.Listar();
                    int count = 0;
                    for (Disciplina disciplina : disciplinas) {
                        if (count >= 4) {
                            break;
                        }
                        System.out.println("Disciplina " + disciplina.getCodigo() + ": " + disciplina.getNome());
                        count++;
                    }
                    System.out.println("Selecione uma disciplina:");
                    int codigoDisciplina = scanner.nextInt();
                    Disciplina disciplinaSelecionada = disciplinaServico.Obter(codigoDisciplina);
                    if (disciplinaSelecionada != null) {
                        menuAluno21(disciplinaSelecionada);
                    } else {
                        System.out.println("Disciplina não encontrada.");
                    }
                    break;
                case 3:
                    System.out.println("Exibindo o rendimento escolar do aluno...");
                    RendimentoEscolarServico rendimentoEscolarServico = new RendimentoEscolarServico();
                    ArrayList<RendimentoEscolar> rendimentos = rendimentoEscolarServico.Listar();
                    for (RendimentoEscolar rendimento : rendimentos) {
                        if (rendimento.getAluno().getCodigo() == idAluno) {
                            System.out.println("Aluno: " + rendimento.getAluno().getNome());
                            System.out.println("Disciplina: " + rendimento.getTurma().getDisciplina().getNome());
                            System.out.println("Nota da prova 1: " + rendimento.getNota1prova());
                            System.out.println("Nota da prova 2: " + rendimento.getNota2prova());
                            System.out.println("Media dos Trabalhos: " + rendimento.getMediaTrabalhos());
                            System.out.println("Media geral: " + rendimento.getMediaGeral());
                            System.out.println("---------------------");
                        }
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, selecione novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    public static void exibirMenuAluno(int idAluno) {
        System.out.println("----- Menu do Aluno (" + idAluno + ") -----");
        System.out.println("1. Informações sobre a turma do aluno.");
        System.out.println("2. Exibir disciplinas");
        System.out.println("3. Exibir rendimento escolar");
        System.out.println("0. Voltar ao menu anterior");
        System.out.print("Selecione uma opção: ");
    }

    public static void menuAluno21(Disciplina disciplinaSelecionada) {
        int opcao;

        do {
            exibirMenuAluno21(disciplinaSelecionada);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nExibindo as notas do aluno na disciplina selecionada... ");
                    int idDisciplina = disciplinaSelecionada.getCodigo();
                    NotaTrabalhoServico notaTrabalhoServico = new NotaTrabalhoServico();
                    ArrayList<NotaTrabalho> notas = notaTrabalhoServico.Listar();
                    for (NotaTrabalho nota : notas) {
                        if ( nota.getCodigo() == idDisciplina) {
                            System.out.println("Nota: " + nota.getNota());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Para ver todas as notas do aluno, abra o rendimento escolar no menu do aluno.");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, selecione novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    public static void exibirMenuAluno21(Disciplina disciplinaSelecionada) {
        System.out.println("----- Menu do Aluno 2.1 (" + disciplinaSelecionada + ") -----");
        System.out.println("1. Exibir notas de trabalho do aluno na disciplina");
        System.out.println("2. Exibir notas do aluno na disciplina");
        System.out.println("0. Voltar ao menu anterior");
        System.out.print("Selecione uma opção: ");
    }
}