package BehavioralPatterns.IteratorPattern;

public class Main {
    public static void main(String[] args) {
        BrowseHistory history = new BrowseHistory();
        history.push("A");
        history.push("B");
        history.push("C");
        history.push("D");

        Iterator<String> iterator = history.createIterator();
        while(iterator.hasNext()){
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}
