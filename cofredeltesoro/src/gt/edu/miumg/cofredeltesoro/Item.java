package gt.edu.miumg.cofredeltesoro;

import java.util.Iterator;
import java.util.logging.Logger;

public class Item {

    private ItemType type;
    private final String nombre;

    public Item(ItemType type, String nombre) {
        this.setType(type);
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public ItemType getType() {
        return type;
    }

    public final void setType(ItemType type) {
        this.type = type;
    }
}

class ItemIterator implements Iterator<Item> {

    private final ItemType type;
    private final Item[] items;
    private int position;
    private static final Logger LOGGER = Logger.getLogger(ItemIterator.class.getName());

    public ItemIterator(ItemType type, Item[] items) {
        this.type = type;
        this.items = items;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        while (position < items.length) {
            if (items[position].getType() == type) {
                return true;
            } else {
                position++;
            }
        }
        return false;
    }

    @Override
    public Item next() {
        return items[position++];
    }

    public static void main(String[] args) {
        Item[] items = {
                new Item(ItemType.ARMA, "Espada"),
                new Item(ItemType.ANILLO, "Anillo de poder"),
                new Item(ItemType.ANILLO, "Anillo de invisibilidad"),
                new Item(ItemType.POCION, "Poción de salud")
        };

        ItemIterator itemIterator = new ItemIterator(ItemType.ANILLO, items);

        while (itemIterator.hasNext()) {
            LOGGER.info(itemIterator.next().toString());
        }
    }
}


