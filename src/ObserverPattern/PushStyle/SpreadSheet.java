package ObserverPattern.PushStyle;

public class SpreadSheet implements Observer {
    @Override
    public void update(int value) {
        System.out.println("SpreadSheet Updated with new Value: " + value);
    }
}
