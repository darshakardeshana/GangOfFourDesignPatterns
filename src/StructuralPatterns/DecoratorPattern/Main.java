package StructuralPatterns.DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        storeCreditCardDetails(new CloudStreamEncryptor(new CloudStreamCompressor(new CloudStream())));
    }

    public static void storeCreditCardDetails(Stream stream){
        stream.write("1234-1234-1234-1234");
    }
}
