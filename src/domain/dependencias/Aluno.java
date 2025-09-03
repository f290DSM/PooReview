package domain.dependencias;

import java.util.List;

public class Aluno {
    public String nome;
    public List<String> conhecimentos;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void assimila(String conhecimento) {
        conhecimentos.add(conhecimento);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", conhecimentos=" + conhecimentos +
                '}';
    }
}
