package StrategyPattern;

public class PNGCompressor implements ICompressor {

    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using PNG");
    }
}
