

public interface TorreControlMediator {
    void registrarAvion(Avion avion);
    void enviarMensaje(String mensaje, Avion remitente);
    boolean puedeAterrizar(Avion avion);
}
