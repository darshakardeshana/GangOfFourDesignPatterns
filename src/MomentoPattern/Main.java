package MomentoPattern;

import MomentoPattern.Document;
import MomentoPattern.History;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        History history = new History();

        document.setContent("a");
        history.push(document.getCurrentState());

        document.setContent("b");
        history.push(document.getCurrentState());

        document.restoreState(history.pop());
        document.restoreState(history.pop());

        System.out.println(document.getContent()); //returns 'a'
    }
}
