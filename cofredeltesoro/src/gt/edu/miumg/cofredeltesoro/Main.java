package gt.edu.miumg.cofredeltesoro;

import java.util.List;
import java.util.Iterator;

class CofreDelTesoroItemIterator implements Iterator<Item> {

    private final List<Item> items;
    private final ItemType itemType;
    private int position = 0;

    public CofreDelTesoroItemIterator(CofreDelTesoro cofreDelTesoro, ItemType itemType) {
        this.items = cofreDelTesoro.getItems();
        this.itemType = itemType;
    }

    @Override
    public boolean hasNext() {
        while (position < items.size()) {
            if (items.get(position).getType() == itemType) {
                return true;
            }
            position++;
        }
        return false;
    }

    @Override
    public Item next() {
        return items.get(position++);
    }
}
