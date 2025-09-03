package domain.dependencias;

import java.util.List;

public class Professor {
    private String nome;
    private List<Aluno> alunos;

    public Professor(String nome) {
        this.nome = nome;
    }

    public void ensina(Curso curso) {
        for (Aluno aluno : alunos) {
            for (String conhecimento: curso.getConhecimentos()) {
                aluno.assimila(conhecimento);
            }
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
