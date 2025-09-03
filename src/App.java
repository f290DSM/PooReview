import domain.dependencias.Curso;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Curso c1 = new Curso();
        c1.setNome("DSM");
        c1.setConhecimentos(Arrays.asList("A", "B", "C"));

        Curso c2 = new Curso();
        c2.setNome("DSM");
        c2.setConhecimentos(Arrays.asList("A", "B", "C"));
    }
}
