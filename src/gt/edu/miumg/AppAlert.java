package gt.edu.miumg;

public class AppAlert implements Observer {
    @Override
    public void update(String message) {
        System.out.println("AppAlert: " + message);
    }
}

