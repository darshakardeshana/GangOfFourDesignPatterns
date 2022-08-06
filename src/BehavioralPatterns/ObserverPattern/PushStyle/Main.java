package BehavioralPatterns.ObserverPattern.PushStyle;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        dataSource.addObserver(new SpreadSheet());
        dataSource.addObserver(new Chart());

        dataSource.setValue(2);
        dataSource.setValue(3);
    }
}
