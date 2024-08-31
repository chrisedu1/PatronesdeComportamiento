//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TorreControl torreControl = new TorreControl();

        Avion avion1 = new AvionConcreto(torreControl, "Avion 1");
        Avion avion2 = new AvionConcreto(torreControl, "Avion 2");
        Avion avion3 = new AvionConcreto(torreControl, "Avion 3");

        avion1.enviarMensaje("Solicitando permiso para aterrizar.");
        avion2.enviarMensaje("Solicitando permiso para despegar.");
        avion3.enviarMensaje("Solicitando información del clima.");

        avion1.aterrizar();
        avion2.despegar();
    }
}