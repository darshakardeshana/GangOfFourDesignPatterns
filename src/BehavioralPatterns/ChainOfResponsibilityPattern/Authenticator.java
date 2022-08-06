package BehavioralPatterns.ChainOfResponsibilityPattern;

public class Authenticator extends Handler{
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Authenticator is working");
        var isValid = request.getUsername() == "admin" && request.getPassword() == "1234";
        return !isValid;
    }
}
