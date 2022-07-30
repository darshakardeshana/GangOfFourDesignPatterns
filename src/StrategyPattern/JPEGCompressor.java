package StrategyPattern;

public class JPEGCompressor implements ICompressor {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using JPEG");
    }
}
