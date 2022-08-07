package StructuralPatterns.FacadePattern;

public class NotificationService {
    public void sendMessage(String message, String target){
        var server = new NotificationServer();
        var connection = server.connect("ip");
        var authToken = server.authenticate("appId", "key");
        server.send(authToken, new Message(message), target);
    }
}
