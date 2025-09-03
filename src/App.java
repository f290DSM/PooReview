import domain.dependencias.Aluno;
import domain.dependencias.Curso;
import domain.dependencias.Professor;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Curso c1 = new Curso();
        c1.setNome("Desenvolviento de Software Multiplataforma");
        c1.setConhecimentos(Arrays.asList(
                "Programação Web",
                "Programação Mobile",
                "Integração Contínua/Entrega Contínuo",
                "Cloud Computing")
        );

        //TODO: Criar alunos
        Aluno a1 = new Aluno("Antonio");
        Aluno a2 = new Aluno("Juliana");

        //TODO: Criar professor
        Professor prof1 = new Professor("Alberto");

        //TODO: Criar relacionamentos e ajustar dependencias
        prof1.setAlunos(Arrays.asList(a1, a2));

        //TODO: Testar o código
        prof1.ensina(c1);

        //TODO: Criar Departamentos

        //TODO: Criar Universidade

        //TODO: Criar relacionamentos e ajustar dependencias

        //TODO: Testar o código

        //TODO: Criar o Curso de Gestão Empresarial

        //TODO: Criar um professor para GE, um curso e 2 alunos

        //TODO: Ajustar os relacionamentos

        //TODO: Testar o código

    }
}
