import domain.Pikachu;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        var pikachu = new Pikachu();
        System.out.println(pikachu.getHp());
    }
}
