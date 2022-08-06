package ObserverPattern.PullStyle;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        dataSource.addObserver(new SpreadSheet(dataSource));
        dataSource.addObserver(new Chart(dataSource));

        dataSource.setValue(4);
        dataSource.setValue(5);
    }
}
