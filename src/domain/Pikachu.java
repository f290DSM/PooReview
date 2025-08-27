package domain;

public class Pikachu {
    private String nick;
    private int cp;
    private int hp;

    public void setHp(int hp) {
        if (hp > 0) {
            this.hp = hp;
        } else {
            System.out.println("Valor inválido de hp: " + hp);
        }
    }

    public int getHp() {
        return hp;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        if (nick != null && nick.length() > 3) {
            this.nick = nick;
        } else {
            System.out.println("Valor inválido de nick: " + nick);
        }
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        if (hp > 0) {
            this.cp = cp;
        } else {
            System.out.println("Valor inválido de cp: " + cp);
        }
    }

    public void thunderbolt() {
        System.out.println("Pikachu ataca com thunderbolt!");
    }

}
