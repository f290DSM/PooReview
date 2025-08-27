package domain;

public class Pikachu extends Pokemon {
    public Pikachu(String nick, int cp, int hp) {
        super(nick, cp, hp);
    }

    @Override
    public void attack() {
        System.out.println("Pikachu ataca com thunderbolt!");
    }
}
