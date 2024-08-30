package gt.edu.miumg.ChainOfResponsability;

public interface ManejadorFabrica {
    void setManejadorFabrica(ManejadorFabrica manejador);
    void procesar(Ingrediente ingrediente);
}
