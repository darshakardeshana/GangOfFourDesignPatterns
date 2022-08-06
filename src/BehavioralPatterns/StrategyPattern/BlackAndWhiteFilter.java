package BehavioralPatterns.StrategyPattern;

public class BlackAndWhiteFilter implements IFilter {
    @Override
    public void apply(String fileName) {
        System.out.println("Applying Black & White Filter");
    }
}
