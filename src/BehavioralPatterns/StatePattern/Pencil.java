package BehavioralPatterns.StatePattern;

public class Pencil implements ITool {
    @Override
    public void clickDown() {
        System.out.println("You have start using Pencil");
    }

    @Override
    public void clickUp() {
        System.out.println("You have stop using Pencil");
    }
}
