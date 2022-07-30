package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage();
        imageStorage.store("Elephant", new JPEGCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("Elephant", new JPEGCompressor(), new BrightColorFilter());
    }
}