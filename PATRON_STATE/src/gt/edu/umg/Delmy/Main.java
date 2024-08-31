package gt.edu.umg.Delmy;


public class Main {
    public static void main(String[] args) {
        laptopStateContext stateComputadora = new laptopStateContext();
        stateComputadora.opcionElegida();
        stateComputadora.opcionElegida();
        System.out.println("*************************************************************");
        stateComputadora.stateElegido(new Encendido());
        stateComputadora.opcionElegida();
        stateComputadora.opcionElegida();
        System.out.println("*************************************************************");

    }
}