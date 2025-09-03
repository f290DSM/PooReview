package domain.pokemon;

public abstract class Pokemon {
    private String nick;
    private int cp;
    private int hp;

    public Pokemon(String nick, int cp, int hp) {
        this.setNick(nick);
        this.setCp(cp);
        this.setHp(hp);
    }

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

    public void iChooseYou() {
        System.out.printf("%s eu escolho voce!", this.getClass().getSimpleName());
    }

    public void comeBack() {
        System.out.printf("%s, volte!", this.getClass().getSimpleName());
    }

    public abstract void attack();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "nick='" + nick + '\'' +
                ", cp=" + cp +
                ", hp=" + hp +
                '}';
    }
}
