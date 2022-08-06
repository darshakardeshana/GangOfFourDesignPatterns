package ObserverPattern.PushStyle;

public class Chart implements Observer {
    @Override
    public void update(int value) {
        System.out.println("Chart Updated with value: " + value);
    }
}
