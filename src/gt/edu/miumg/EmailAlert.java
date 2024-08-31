package gt.edu.miumg;

public class EmailAlert implements Observer {
    @Override
    public void update(String message) {
        System.out.println("EmailAlert: " + message);
    }
}
