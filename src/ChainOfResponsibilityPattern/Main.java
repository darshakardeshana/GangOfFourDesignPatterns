package ChainOfResponsibilityPattern;

public class Main {
    public static void main(String[] args) {
        // authenticator -> encryptor -> logger -> compressor
        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var encryptor = new Encryptor(logger);
        var authenticator = new Authenticator(encryptor);

        var server = new Webserver(authenticator);
        server.handle(new HttpRequest("admin", "1234"));
    }
}
