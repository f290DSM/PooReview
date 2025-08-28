package domain;

public class Zapdos extends Pokemon implements FlyingType, EletricType {
    public Zapdos(String nick, int cp, int hp) {
        super(nick, cp, hp);
    }

    @Override
    public void thundebolt() {
        System.out.println("Zapdos thundebolt!");
    }

    @Override
    public void wingAttack() {
        System.out.println("Zapdos wingAttack!");
    }

    @Override
    public void attack() {
        wingAttack();
        thundebolt();
    }
}
