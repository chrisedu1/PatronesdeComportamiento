package gt.edu.miumg;
public class Main {
    public static void main(String[] args) {
        // Crear el sujeto (WeatherStation)
        WeatherStation weatherStation = new WeatherStation();

        // Crear observadores
        Observer smsAlert = new SMSAlert();
        Observer emailAlert = new EmailAlert();
        Observer appAlert = new AppAlert();

        // Suscribir observadores al WeatherStation
        weatherStation.attach(smsAlert);
        weatherStation.attach(emailAlert);
        weatherStation.attach(appAlert);

        System.out.println("\n--- Cambiando el clima a Soleado ---");
        weatherStation.setWeather("Soleado"); // No se notificará a los observadores

        System.out.println("\n--- Cambiando el clima a Tormenta ---");
        weatherStation.setWeather("Tormenta"); // Se notificará a los observadores

        // Desuscribir un observador
        weatherStation.detach(emailAlert);

        System.out.println("\n--- Cambiando el clima a Tormenta nuevamente ---");
        weatherStation.setWeather("Tormenta"); // Solo SMSAlert y AppAlert recibirán la notificación
    }
}
