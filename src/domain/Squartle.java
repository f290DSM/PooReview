package domain;

public class Squartle extends Pokemon {
    public Squartle(String nick, int cp, int hp) {
        super(nick, cp, hp);
    }

    @Override
    public void attack() {
        System.out.println("Squartle ataca com thunderbolt!");
    }
}
