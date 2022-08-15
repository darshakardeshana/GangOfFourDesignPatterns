package CreationalPatterns.Prototype;

public interface Component {
    void render();

    Component clone();
}
