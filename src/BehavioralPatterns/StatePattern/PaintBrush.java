package BehavioralPatterns.StatePattern;

public class PaintBrush implements ITool {
    @Override
    public void clickDown() {
        System.out.println("You have start using Paint Brush");
    }

    @Override
    public void clickUp() {
        System.out.println("You have stop using Paint Brush");
    }
}
