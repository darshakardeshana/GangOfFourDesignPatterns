package CommandPattern.fx;

public class ResizeCommand implements ICommand {
    @Override
    public void execute() {
        System.out.println("Applying Resize");
    }
}
