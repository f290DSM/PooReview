package domain.dependencias;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private List<Aluno> alunos = new ArrayList<Aluno>();

    public Professor(String nome) {
        this.nome = nome;
    }

    public void ensina(Curso curso) {
        if (curso == null) {
            System.out.println("Curso inválido");
            return;
        }
        System.out.println("\nCurso: " + curso.getNome());
        for (Aluno aluno : alunos) {
            System.out.println("-------------------------------------");
            System.out.printf("Aluno: %s\n", aluno);
            for (String conhecimento : curso.getConhecimentos()) {
                System.out.printf("Assimilou o conhecimento: %s\n", conhecimento);
                aluno.assimila(conhecimento);
            }
            System.out.printf("Aluno: %s\n", aluno);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", alunos=" + alunos +
                '}';
    }
}
