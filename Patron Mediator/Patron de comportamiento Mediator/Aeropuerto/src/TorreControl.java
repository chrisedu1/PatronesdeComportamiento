import java.util.ArrayList;
import java.util.List;

public class TorreControl implements TorreControlMediator {
    private List<Avion> aviones;

    public TorreControl() {
        this.aviones = new ArrayList<>();
    }

    @Override
    public void registrarAvion(Avion avion) {
        aviones.add(avion);
    }

    @Override
    public void enviarMensaje(String mensaje, Avion remitente) {
        for (Avion avion : aviones) {
            // No reenvia el mensaje al avión remitente
            if (avion != remitente) {
                avion.recibirMensaje(mensaje);
            }
        }
    }

    @Override
    public boolean puedeAterrizar(Avion avion) {
        // Simple lógica para determinar si el avión puede aterrizar
        return true;
    }
}
