package memento;

public class Memento {
    private final int level;
    private final int kills;

    public Memento(Game game) {
        this.level = game.getLevel();
        this.kills = game.getKills();
    }

    public int getLevel() {
        return level;
    }

    public int getKills() {
        return kills;
    }
}
