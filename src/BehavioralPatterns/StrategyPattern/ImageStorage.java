package BehavioralPatterns.StrategyPattern;

public class ImageStorage {
    public void store(String fileName, ICompressor compressor, IFilter filter){
        compressor.compress(fileName);
        filter.apply(fileName);
        System.out.println("File " + fileName + " Stored Successfully");
    }
}
