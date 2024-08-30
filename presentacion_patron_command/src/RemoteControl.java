import java.util.HashMap;
import java.util.Map;

public class RemoteControl {
    private Map<String, Command> commandMap = new HashMap<>();

    public void setCommand(String button, Command command) {
        commandMap.put(button, command);
    }

    public void pressButton(String button) {
        Command command = commandMap.get(button);
        if (command != null) {
            command.execute();
        } else {
            System.out.println("No se ha asignado ningún comando al botón '" + button + "'");
        }
    }
}
