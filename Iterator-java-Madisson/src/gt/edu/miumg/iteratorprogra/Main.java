package gt.edu.miumg.iteratorprogra;


import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> autos = new ArrayList<String>();
        autos.add("Volvo");
        autos.add("BMW");
        autos.add("Ford");
        autos.add("Mazda");

        Iterator<String> it = autos.iterator();

        do {
            System.out.println(it.next());
        } while (it.hasNext());

    }
}
