package domain;

public class Pikachu extends Pokemon implements EletricType {
    public Pikachu(String nick, int cp, int hp) {
        super(nick, cp, hp);
    }

    @Override
    public void attack() {
        thundebolt();
    }

    @Override
    public void thundebolt() {
        System.out.println("Pikachu ataca com thunderbolt!");
    }
}
