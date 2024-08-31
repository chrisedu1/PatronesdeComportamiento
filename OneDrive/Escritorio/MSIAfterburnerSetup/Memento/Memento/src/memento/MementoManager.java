package memento;

import java.util.ArrayList;
import java.util.List;

public class MementoManager {

    private final List<Memento> mementos = new ArrayList<>();
    private int index = -1;

    public void save(Memento memento) {
        // Elimina los estados futuros si estamos en el medio del historial
        if (index < mementos.size() - 1) {
            mementos.subList(index + 1, mementos.size()).clear();
        }
        mementos.add(memento);
        index++;
    }

    public Memento undo() {
        if (canUndo()) {
            return mementos.get(--index);
        }
        throw new IllegalStateException("No hay estados anteriores para deshacer.");
    }

    public Memento redo() {
        if (canRedo()) {
            return mementos.get(++index);
        }
        throw new IllegalStateException("No hay estados futuros para rehacer.");
    }

    public boolean canUndo() {
        return index > 0;
    }

    public boolean canRedo() {
        return index < mementos.size() - 1;
    }
}
