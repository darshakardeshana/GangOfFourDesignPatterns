package StructuralPatterns.FacadePattern;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendMessage("Hello", "target");
    }
}
