package CreationalPatterns.Prototype;

public class ContextMenu {
    public Component duplicate(Component component) {
        return component.clone();
    }
}
