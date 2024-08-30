package gt.edu.miumg.ChainOfResponsability;

public class Main {
    public static void main(String[] args) {
        ManejadorFabrica churroClasico = new ChurroClasico();
        ManejadorFabrica churroSuave = new ChurroSuave();
        ManejadorFabrica churroCrujiente = new ChurroCrujiente();

        churroClasico.setManejadorFabrica(churroSuave);
        churroSuave.setManejadorFabrica(churroCrujiente);

        Ingrediente ingrediente = new Ingrediente("Ingrediente Clasico");
        churroClasico.procesar(ingrediente);

        ingrediente = new Ingrediente("Ingrediente Suave");
        churroClasico.procesar(ingrediente);

        ingrediente = new Ingrediente("Ingrediente Crujiente");
        churroClasico.procesar(ingrediente);

        ingrediente = new Ingrediente("Ingrediente Picante");
        churroClasico.procesar(ingrediente);
    }
}
