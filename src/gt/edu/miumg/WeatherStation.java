package gt.edu.miumg;
import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private List<Observer> observers;
    private String weather;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
        System.out.println(observer.getClass().getSimpleName() + " ha sido suscrito a WeatherStation.");
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
        System.out.println(observer.getClass().getSimpleName() + " ha sido desuscrito de WeatherStation.");
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("¡Alerta! Se aproxima una tormenta: " + weather);
        }
    }

    // Actualizar el clima
    public void setWeather(String weather) {
        this.weather = weather;
        System.out.println("WeatherStation: El clima ha sido actualizado a: " + weather);
        if (weather.equalsIgnoreCase("Tormenta")) {
            notifyObservers();
        }
    }

    // Obtener el clima actual
    public String getWeather() {
        return weather;
    }
}

