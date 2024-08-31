public class Main {
    public static void main(String[] args) {
        // Crear los receptores
        Light livingRoomLight = new Light();
        Fan kitchenFan = new Fan();

        // Crear los comandos
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command fanOn = new FanOnCommand(kitchenFan);
        Command fanOff = new FanOffCommand(kitchenFan);

        // Configurar el control remoto
        RemoteControl remote = new RemoteControl();
        remote.setCommand("A", lightOn);
        remote.setCommand("B", lightOff);
        remote.setCommand("C", fanOn);
        remote.setCommand("D", fanOff);

        // Simular la presión de botones
        remote.pressButton("A");  // La luz está encendida.
        remote.pressButton("B");  // La luz está apagada.
        remote.pressButton("C");  // El ventilador está encendido.
        remote.pressButton("D");  // El ventilador está apagado.
    }
}
