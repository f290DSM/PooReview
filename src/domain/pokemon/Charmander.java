package domain.pokemon;

public class Charmander extends Pokemon {
    public Charmander(String nick, int cp, int hp) {
        super(nick, cp, hp);
    }

    @Override
    public void attack() {
        System.out.println("Charmander ataca com thunderbolt!");
    }
}
