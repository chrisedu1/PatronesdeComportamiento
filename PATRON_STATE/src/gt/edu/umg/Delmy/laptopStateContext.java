package gt.edu.umg.Delmy;


public class laptopStateContext {
    private  laptopState compuEstado;
    public laptopStateContext()
    {
        compuEstado = new Apagado();
    }
    public void stateElegido(laptopState estado) {

        compuEstado = estado;
    }



    public void opcionElegida() {

        compuEstado.opcionElegida(this);
    }
}
