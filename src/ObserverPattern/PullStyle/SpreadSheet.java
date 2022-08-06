package ObserverPattern.PullStyle;

public class SpreadSheet implements Observer {
    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        int value = dataSource.getValue();
        System.out.println("SpreadSheet Updated with new Value: " + value);
    }
}
