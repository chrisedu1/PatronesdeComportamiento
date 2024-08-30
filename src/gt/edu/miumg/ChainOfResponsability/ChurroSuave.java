package gt.edu.miumg.ChainOfResponsability;

public class ChurroSuave implements ManejadorFabrica{
    private ManejadorFabrica manejadorFabrica;

    @Override
    public void setManejadorFabrica(ManejadorFabrica manejador) {
        manejadorFabrica = manejador;
    }

    @Override
    public void procesar(Ingrediente ingrediente) {
        if(ingrediente.getNombre().equals("Ingrediente Suave")){
            System.out.println("Ingrediente procesado (Churro Suave)");
            System.out.println("---------------------------------");
        }else if(manejadorFabrica != null){
            System.out.println("Pasa a siguiente manejador");
            manejadorFabrica.procesar(ingrediente);
        }else {
            System.out.println("No se pudo procesar");
        }
    }
}
