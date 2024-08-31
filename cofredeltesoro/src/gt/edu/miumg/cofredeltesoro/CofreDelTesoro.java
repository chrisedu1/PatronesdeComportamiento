package gt.edu.miumg.cofredeltesoro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CofreDelTesoro {

    private final List<Item> items;

    public CofreDelTesoro() {
        items = List.of(
                new Item(ItemType.POCION, "Poción de coraje"),
                new Item(ItemType.ANILLO, "Anillo de las sombras"),
                new Item(ItemType.POCION, "Poción de sabiduría"),
                new Item(ItemType.POCION, "Poción de sangre"),
                new Item(ItemType.ARMA, "Espada de plata +1"),
                new Item(ItemType.POCION, "Poción de óxido"),
                new Item(ItemType.POCION, "Poción de curación"),
                new Item(ItemType.ANILLO, "Anillo de armadura"),
                new Item(ItemType.ARMA, "Alabarda de acero"),
                new Item(ItemType.ARMA, "Daga envenenada"));
    }

    public Iterator<Item> iterator(ItemType itemType) {
        return new CofreDelTesoroItemIterator(this, itemType);
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
}
}
