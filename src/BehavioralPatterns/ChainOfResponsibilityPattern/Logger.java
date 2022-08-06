package BehavioralPatterns.ChainOfResponsibilityPattern;

public class Logger extends Handler{
    public Logger(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Logger is working");
        return false;
    }
}
