package BehavioralPatterns.ChainOfResponsibilityPattern;

public class Encryptor extends Handler {

    public Encryptor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Encryptor is working");
        return false;
    }
}
