package gt.edu.miumg;

public class SMSAlert implements Observer {
    @Override
    public void update(String message) {
        System.out.println("SMSAlert: " + message);
    }
}

