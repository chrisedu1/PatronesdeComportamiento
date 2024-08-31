public abstract class Avion {
    protected TorreControlMediator mediator;
    protected String nombre;

    public Avion(TorreControlMediator mediator, String nombre) {
        this.mediator = mediator;
        this.nombre = nombre;
    }

    public abstract void recibirMensaje(String mensaje);
    public abstract void enviarMensaje(String mensaje);
    public abstract void aterrizar();
    public abstract void despegar();
}
