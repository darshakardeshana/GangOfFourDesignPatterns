package BehavioralPatterns.ObserverPattern.PullStyle;

public class Chart implements Observer {
    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        int value = dataSource.getValue();
        System.out.println("Chart Updated with value: " + value);
    }
}
