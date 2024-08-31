


public class AvionConcreto extends Avion {

    public AvionConcreto(TorreControlMediator mediator, String nombre) {
        super(mediator, nombre);
        mediator.registrarAvion(this);
    }

    @Override
    public void recibirMensaje(String mensaje) {
        System.out.println("Torre de Control: Enviando mensaje a " + nombre + ": " + mensaje);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println(nombre + " envía: " + mensaje);
        mediator.enviarMensaje(nombre + " " + mensaje, this);
    }

    @Override
    public void aterrizar() {
        if (mediator.puedeAterrizar(this)) {
            System.out.println(nombre + " está aterrizando.");
        } else {
            System.out.println(nombre + " está esperando para aterrizar.");
        }
    }

    @Override
    public void despegar() {
        System.out.println(nombre + " está despegando.");
    }
}