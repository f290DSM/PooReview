package domain.pokemon;

public class Blaziken extends Pokemon {
    public Blaziken(String nick, int cp, int hp) {
        super(nick, cp, hp);
    }

    @Override
    public void attack() {
        System.out.println("Squartle ataca com thunderbolt!");
    }
}
