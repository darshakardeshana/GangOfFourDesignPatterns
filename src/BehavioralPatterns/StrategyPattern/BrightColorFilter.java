package BehavioralPatterns.StrategyPattern;

public class BrightColorFilter implements IFilter {
    @Override
    public void apply(String fileName) {
        System.out.println("Applying Bright Color Filter");
    }
}
