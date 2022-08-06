package BehavioralPatterns.CommandPattern.fx;

public class BlackAndWhiteFilterCommand implements ICommand {
    @Override
    public void execute() {
        System.out.println("Applying Black and White Filter");
    }
}
