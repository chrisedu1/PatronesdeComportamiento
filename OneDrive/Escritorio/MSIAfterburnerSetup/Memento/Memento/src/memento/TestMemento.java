package memento;

public class TestMemento {
    public static void main(String[] args) {
        String name = "game1";

        // Crear una instancia de Game y establecer el estado inicial
        Game game = new Game(name, 1, 0);
        game.save(); // Guardar el primer estado
        System.out.println("Estado Guardado 1: " + game);

        // Modificar el estado del juego
        game.setLevel(2);
        game.setKills(10);
        game.save(); // Guardar el segundo estado
        System.out.println("Estado Guardado 2: " + game);

        // Modificar el estado nuevamente
        game.setLevel(3);
        game.setKills(20);
        game.save(); // Guardar el tercer estado
        System.out.println("Estado Guardado 3: " + game);

        // Mostrar la separación de los estados guardados
        System.out.println("===============");

        // Deshacer al estado anterior
        game.back();
        System.out.println("Deshacer 1: " + game);

        // Deshacer nuevamente para volver al estado inicial
        game.back();
        System.out.println("Deshacer 2: " + game);

        // Mostrar la separación antes de rehacer
        System.out.println("===============");

        // Rehacer al último estado deshecho
        game.forward();
        System.out.println("Rehacer 1: " + game);

        // Rehacer nuevamente para volver al estado más reciente
        game.forward();
        System.out.println("Rehacer 2: " + game);
    }
}
