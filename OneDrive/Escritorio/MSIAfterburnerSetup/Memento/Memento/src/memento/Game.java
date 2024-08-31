package memento;

public class Game {
    private String name;
    private int level;
    private int kills;
    private final MementoManager manager = new MementoManager();

    public Game(String name, int level, int kills) {
        this.name = name;
        this.level = level;
        this.kills = kills;
    }

    public void save() {
        manager.save(new Memento(this));
    }

    public void back() {
        if (manager.canUndo()) {
            Memento memento = manager.undo();
            this.level = memento.getLevel();
            this.kills = memento.getKills();
        } else {
            System.out.println("No hay estados anteriores para deshacer.");
        }
    }

    public void forward() {
        if (manager.canRedo()) {
            Memento memento = manager.redo();
            this.level = memento.getLevel();
            this.kills = memento.getKills();
        } else {
            System.out.println("No hay estados futuros para rehacer.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level >= 0) {
            this.level = level;
        } else {
            throw new IllegalArgumentException("El nivel no puede ser negativo.");
        }
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        if (kills >= 0) {
            this.kills = kills;
        } else {
            throw new IllegalArgumentException("Las kills no pueden ser negativas.");
        }
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", level=" + level +
                ", kills=" + kills;
    }
}
